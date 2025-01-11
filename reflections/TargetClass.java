package reflections;

public class TargetClass {
    private long studentID;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private double score;
    private double fees;
    private String name;
    private String address;

    public TargetClass(long studentID, double score, double fees, String name, String address) {
        this.studentID = studentID;
        this.score = score;
        this.fees = fees;
        this.name = name;
        this.address = address;
    }
    public TargetClass(long studentID, double score,  String name, String address1) {
            this.studentID = studentID;
            this.score = score;
            this.name = name;
            this.address = address1;
        }

    public TargetClass(){}

    class InnerClass{
        private String Secret;
        private String message;

        public InnerClass(String secret, String message) {
            Secret = secret;
            this.message = message;
        }
    }
}
