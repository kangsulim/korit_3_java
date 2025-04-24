package Beakjoon;

import ch09_classes.students.Student;

interface StudentService {
  add(student s);
  remove(int studentId);
}

class StudentRepository {
  public insert(student s) {

  }

  public delete(int studentId) {

  }
}

class StudentServiceImp1 implements StudentService {
  private StudentService sr;

  public StudentServiceImp1(StudentRepository sr) {
    this.sr = sr;
  }

  public void add(Student s){sr.insert(s);}
  public void remove(int StudentId){sr.delete(studentId)}
}

public class Main {
  public static void main(String[] args) {
    StudentRepository sr = new StudentRepository();
    StudentService ss = new StudentService(sr);
  }
}
