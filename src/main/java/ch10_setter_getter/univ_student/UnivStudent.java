package ch10_setter_getter.univ_student;

public class UnivStudent {
    private String name;
    private int grade;
    private double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        if (grade < 1 || grade > 4){
            System.out.println("올바르지 않은 grade 입력입니다.\n");
            return;
        }
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;

        if (grade < 1 || grade > 4){
            System.out.println("올바르지 않은 grade 입력입니다.\n");
            return;
        }
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;

        // grade
        if (grade < 1 || grade > 4){
            System.out.println("올바르지 않은 grade 입력입니다.\n");
            return;
        }
        this.grade = grade;

        // score
        if (score < 0.0 || score > 4.5){
            System.out.println("올바르지 않은 score 입력입니다.\n");
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 4){
            System.out.println("올바르지 않은 grade 입력입니다.\n");
            return;
        }
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0.0 || score > 4.5){
            System.out.println("올바르지 않은 score 입력입니다.\n");
            return;
        }
        this.score = score;
    }

    void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
        System.out.println();
    }
}
