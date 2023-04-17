package Java01.godoro.education;

public class Student {
    private int studentId;
    private String studentName;
    private double averageMark;

    private Classroom classroom;

    public Student(int studentId, String studentName, double averageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {

        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
