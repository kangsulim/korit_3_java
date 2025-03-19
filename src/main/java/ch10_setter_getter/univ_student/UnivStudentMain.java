package ch10_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent student1 = new UnivStudent();
        student1.setName("김일");
        student1.setGrade(1);
        student1.setScore(3.3);

        UnivStudent student2 = new UnivStudent("김이");
        student2.setGrade(3);
        student2.setScore(-30);
        student2.setScore(4.0);

        UnivStudent student3 = new UnivStudent(5);
        student3.setName("김삼");
        student3.setGrade(2);
        student3.setScore(2.7);

        UnivStudent student4 = new UnivStudent("김사", 4);
        student4.setScore(3.8);

        UnivStudent student5 = new UnivStudent("김오", 2, 1.0);

        // showInfo
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}
