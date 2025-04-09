# ✅ 자바 예외 처리의 세 가지 방법

자바에서 예외(Exception)는 프로그램 실행 중 발생할 수 있는 오류를 말합니다. 예외 처리는 안정적인 프로그램 실행을 위해 꼭 필요한 요소입니다. 이번 문서에서는 자바에서 예외를 처리하는 세 가지 방법을 정리해봅니다.

---

## 1. `try-catch-finally`

예외가 발생할 가능성이 있는 코드를 `try` 블록에 작성하고, 예외가 발생하면 `catch` 블록이 실행됩니다. `finally` 블록은 예외 발생 여부와 상관없이 항상 실행됩니다.

### ✅ 기본 구조
```java
try {
    // 예외가 발생할 가능성이 있는 코드
} catch (예외타입 변수명) {
    // 예외 처리 코드
} finally {
    // 예외 발생 여부와 관계없이 항상 실행
}
```

### 📌 예제
```java
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("finally 블록 실행됨");
        }
    }
}
```

---

## 2. `throws`

메서드에서 예외를 직접 처리하지 않고, 호출한 쪽으로 예외를 전달하는 방식입니다.

### ✅ 기본 구조
```java
반환형 메서드명(매개변수) throws 예외타입 {
    // 예외가 발생할 수 있는 코드
}
```

### 📌 예제
```java
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("나이가 너무 어려요!");
        }
        System.out.println("입장 가능");
    }
}
```

---

## 3. 사용자 정의 예외 처리

자신만의 예외 클래스를 만들어 특정 상황에 대해 명확한 의미를 부여할 수 있습니다.

### ✅ 예외 클래스 만들기
```java
class 예외이름 extends Exception {
    public 예외이름(String message) {
        super(message);
    }
}
```

### 📌 예제
```java
// 사용자 정의 예외 클래스
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            enterClub(16);
        } catch (UnderAgeException e) {
            System.out.println("사용자 정의 예외 발생: " + e.getMessage());
        }
    }

    public static void enterClub(int age) throws UnderAgeException {
        if (age < 19) {
            throw new UnderAgeException("19세 미만은 출입할 수 없습니다.");
        }
        System.out.println("클럽 입장 완료!");
    }
}
```

---

## 📝 마무리 정리

| 방식 | 설명 | 예외 처리 위치 |
|------|------|----------------|
| `try-catch-finally` | 예외 발생 시 직접 처리 | 메서드 내부 |
| `throws` | 예외를 호출한 쪽에 위임 | 메서드 선언부 |
| 사용자 정의 예외 | 특정 상황에 맞춘 예외 클래스 | 자유롭게 활용 가능 |

---

예외 처리는 단순히 오류를 막는 것이 아니라, **프로그램의 안정성과 가독성**을 높이는 데 중요한 역할을 합니다. 상황에 맞게 적절한 방식을 선택해서 사용하세요! 🚀
