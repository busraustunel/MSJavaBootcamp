package Java01.godoro.education;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        School school = new School(901, "Godoro Üniversitesi");
        school.setClassroomList(new ArrayList<Classroom>());

        Classroom classroom1 = new Classroom(701, "Mühendislik");
        classroom1.setStudentList(new ArrayList<Student>());
        school.getClassroomList().add(classroom1);


        Student student1 = new Student(301, "Neşet Ertaş", 45.2);
        student1.setClassroom(classroom1);
        classroom1.getStudentList().add(student1);

        Student student2 = new Student(303,"Mahsuni Şerif",36.5);
        student2.setClassroom(classroom1);
        classroom1.getStudentList().add(student2);

        Student student3 = new Student(304, "Celal Güzelses", 61.2);
        student3.setClassroom(classroom1);
        classroom1.getStudentList().add(student3);

        Classroom classroom2 = new Classroom(702, "Ekonomi");
        classroom2.setStudentList(new ArrayList<Student>());
        school.getClassroomList().add(classroom2);

        Student student4 = new Student(302, "Erkan Ocaklı", 71.3);
        student4.setClassroom(classroom2);
        classroom2.getStudentList().add(student4);

        Student student5 = new Student(305, "Mustafa Topaloğlu", 42.2);
        student5.setClassroom(classroom2);
        classroom2.getStudentList().add(student5);

        System.out.println("\t" + school.getSchoolId() + " " + school.getSchoolName());
        for(Classroom classroom : school.getClassroomList()) {
            System.out.println("\t\t" + classroom.getClassroomId() + " " + classroom.getClassroomName());
            for (Student student : classroom.getStudentList()) {
                System.out.println("\t\t\t" + student.getStudentId() + " " + student.getStudentName() + " " + student.getAverageMark());
            }
        }

    }

}
