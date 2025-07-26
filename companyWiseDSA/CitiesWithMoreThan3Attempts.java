package companyWiseDSA;

import com.mysql.cj.log.Log;

import java.util.*;
import java.util.stream.Collectors;
class Attempt{
    private String city;
    private String date;
    private String timeStamp;

    public Attempt(String city, String date, String timeStamp) {
        this.city = city;
        this.date = date;
        this.timeStamp = timeStamp;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}

public class CitiesWithMoreThan3Attempts {
    public static void main(String[] args) {
        List<Attempt> attempts = new ArrayList<>();

        attempts.add(new Attempt("Mumbai", "26072025", "523465632456"));
        attempts.add(new Attempt("Parbhani", "26072025", "523465632456"));
        attempts.add(new Attempt("Parbhani", "26072025", "523465632456"));
        attempts.add(new Attempt("Pune", "26072025", "523465632456"));
        attempts.add(new Attempt("Mumbai", "26072025", "523465632456"));
        attempts.add(new Attempt("Mumbai", "26072025", "523465632456"));
        attempts.add(new Attempt("Jintur", "26072025", "523465632456"));
        attempts.add(new Attempt("Parbhani", "26072025", "523465632456"));
        attempts.add(new Attempt("Jalgaon", "27072025", "523465632456"));
        attempts.add(new Attempt("Purna", "27072025", "523465632456"));
        attempts.add(new Attempt("Parbhani", "27072025", "523465632456"));

        Set<String> cities = citiesWithMoreThan3Attempts(attempts);

        for (String str: cities){
            System.out.print(str+" ");
        }

    }

    public static Set<String> citiesWithMoreThan3Attempts(List<Attempt> attemptList){

        Map<String, Long> attemptMap = new HashMap<>();

        attemptMap = attemptList.stream().collect(
                Collectors.groupingBy(
                        attempt -> attempt.getCity() + "|" + attempt.getDate(), Collectors.counting()
                )
        );

        Set<String> citiesWithHighAttempts = new HashSet<>();
        for (Map.Entry<String, Long> attempt: attemptMap.entrySet()){
            if (attempt.getValue()>=3){
                citiesWithHighAttempts.add(attempt.getKey().split("\\|")[0]);
            }
        }

        return citiesWithHighAttempts;

    }
}
