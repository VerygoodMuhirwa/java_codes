

public class StudentBean {
    private String studId;
    private String fName;
    private String lName;

    public StudentBean(String studId, String fName, String lName) {
        this.studId = studId;
        this.fName = fName;
        this.lName = lName;
    }

    public String getStudId() {
        return studId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}