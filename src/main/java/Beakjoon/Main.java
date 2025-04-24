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

/*
## 🔍 1. 원래 구조 (결합도가 높은 구조)

```java
class StudentServiceImp1 implements StudentService {
  private StudentRepository sr;

  public StudentServiceImp1() {
    sr = new StudentRepository(); // 여기서 직접 생성!
  }

  public void add(Student s){sr.insert(s);}
  public void remove(int studentId){sr.delete(studentId);}
}
```

### ❌ 문제점: 강한 결합 (Tight Coupling)

- `StudentServiceImp1`는 내부에서 **직접 `StudentRepository`를 생성**한다.
- 즉, `StudentServiceImp1`는 항상 `StudentRepository`에 **의존**하며,
- 나중에 `StudentRepository`를 다른 구현체로 바꾸고 싶어도 **바꿀 수 없어!**
- 테스트할 때도 **가짜 저장소(Mock 등)** 를 쓰기 힘들어.

> ❗ 직접 생성 = 코드 내부에서 객체를 "new" 하면 → 구조가 단단히 묶여 있어서 테스트나 변경이 어려움!

---

## ✅ 2. 개선된 구조 (결합도를 낮춘 구조)

```java
class StudentServiceImp1 implements StudentService {
  private StudentRepository sr;

  public StudentServiceImp1(StudentRepository sr) {
    this.sr = sr; // 외부에서 주입받음!
  }

  public void add(Student s){sr.insert(s);}
  public void remove(int studentId){sr.delete(studentId);}
}
```

### ✅ 장점: 느슨한 결합 (Loose Coupling)

- `StudentRepository` 객체를 **외부에서 주입(inject)** 하도록 바꿈.
- `StudentServiceImp1`은 이제 `StudentRepository`에 **직접 의존하지 않아**.
- 다양한 저장소 구현을 받을 수 있어 (예: 파일 저장소, 메모리 저장소, 테스트용 저장소 등).
- 테스트할 땐 **가짜 객체(mock)** 도 쉽게 전달 가능!

```java
public class Main {
  public static void main(String[] args) {
    StudentRepository repo = new StudentRepository();
    StudentService ss = new StudentServiceImp1(repo);
  }
}
```

---

## 📊 결합도 비교

| 항목 | 원래 구조 | 개선 구조 |
|------|-----------|-----------|
| **결합도** | 높음 (강한 결합) | 낮음 (느슨한 결합) |
| **확장성** | 낮음 (Repository 고정) | 높음 (다양한 Repository 대응 가능) |
| **테스트 용이성** | 낮음 (mock 객체 불가) | 높음 (mock 주입 가능) |
| **유연성** | 낮음 | 높음 |
| **재사용성** | 낮음 | 높음 |

---

## 🎯 비유로 쉽게 설명하자면

- **원래 구조**는 마치 **배달기사가 직접 오토바이를 사서 운전**해야 하는 구조야.
- **개선된 구조**는 **회사에서 어떤 탈 것(오토바이, 자전거, 킥보드 등)을 제공**하는 구조지.

> 즉, 필요한 도구를 직접 만드는 게 아니라 **외부에서 주입받도록 하면 유연해진다**는 게 핵심!

 */