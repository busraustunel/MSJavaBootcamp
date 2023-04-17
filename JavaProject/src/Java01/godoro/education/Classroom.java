package Java01.godoro.education;

import java.util.List;

public class Classroom {
    private int classroomId;

    private String classroomName;

    private List<Student> studentList;

    public Classroom(int classroomId, String classroomName) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
