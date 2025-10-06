package companyWisePrep.PreciselyDoSelectPrep;

class Problem{
    int credits;
    String type;
    public Problem(int credits, String type){
        this.credits=credits;
        this.type=type;
    }
}

class CheckerException extends Exception{
    public CheckerException(String message){ super(message);}
    public CheckerException(){}

    public String checkProblem(Problem p) throws Exception{
        if(p.credits<10) throw new CheckerException("Credits are below 10");
        else if (p.type.equalsIgnoreCase("string")) throw new CheckerException("String issue found");
        else if (p.type.equalsIgnoreCase("general")) throw new CheckerException("General issue found");
        return "All Good";
    }
}

public class ApproverProblemException {
    public static void main(String[] args) throws CheckerException{
        Problem p = new Problem(2, "Normal");
        try{
            CheckerException checkerException = new CheckerException();
            checkerException.checkProblem(p);
        }catch (Exception c){
            System.out.println(c.getMessage());
        }
    }
}
