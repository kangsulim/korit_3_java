package ch11_access_modifier;

class AccessModifierExample {
    // 필드 선언
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    // 메서드 선언
    public void show() {
        System.out.println("public : " + publicVar);
        System.out.println("protected : " + protectedVar);
        System.out.println("default : " + defaultVar);
        System.out.println("private : " + privateVar);
    }
}

class Main {
    public static void main(String[] args) {
        // 객체 생성

        AccessModifierExample accessModifierExample = new AccessModifierExample();

        System.out.println(accessModifierExample.publicVar);
        System.out.println(accessModifierExample.protectedVar);
        System.out.println(accessModifierExample.defaultVar);
//        System.out.println(accessModifierExample.privateVar);

        accessModifierExample.show();

        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.show();
    }
}
