package MiniProject;
import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
     String operationType;
     ArrayList<Students> students;
     Students student;

    public PackageData(String operationType, Students student, ArrayList<Students> students) {
        this.operationType = operationType;
        this.student = student;
        this.students = students;
    }
    public PackageData() {}

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "PackageData{" +
                "operationType='" + operationType + '\'' +
                ", students=" + students +
                ", student=" + student +
                '}';
    }
}
