package Java01.godoro.education;

import java.util.List;

public class School {
    private int schoolId;
    private String schoolName;

    private List<Classroom> classroomList;

    public School(int schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }
}
