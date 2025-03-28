package ch16_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("강수림", "고등학교");
        Teacher teacher2 = new Teacher("강수림", "고등학교");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);

        boolean result2 = teacher1 == teacher2;
        System.out.println(result2);
    }
}
