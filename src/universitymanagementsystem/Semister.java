
package universitymanagementsystem;


public class Semister {
    private String semisterId;
    private String semisterName;
    private String semisterYear;

    public Semister(String semisterId, String semisterName, String semisterYear) {
        this.semisterId = semisterId;
        this.semisterName = semisterName;
        this.semisterYear = semisterYear;
    }

    public String getSemisterId() {
        return semisterId;
    }

    public String getSemisterName() {
        return semisterName;
    }

    public void setSemisterName(String semisterName) {
        this.semisterName = semisterName;
    }

    public String getSemisterYear() {
        return semisterYear;
    }

    public void setSemisterYear(String semisterYear) {
        this.semisterYear = semisterYear;
    }

    @Override
    public String toString() {
        return "Semister{" + "semisterId=" + semisterId + ", semisterName=" + semisterName + ", semisterYear=" + semisterYear + '}';
    }
      
}
