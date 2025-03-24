package ch00_review;
/*
    1. 필드
    name - 캐릭터 이름 공개 - 전사
    health - 체력 - 읽기만 허용 - 100
    power - 공격력 - 같은 패키지만 - 200
    skill - 스킬 이름 자식 클래스만
    exp - 경험치 외부 차단

    2. 메서드
    getHealth - 체력값 반환 getter
    attack - 공격 동작 시 "name이 power로 공격!"
    heal - 체력을 10 회복하고, 현재 체력 출력
    gainExp(int amount)

    3. 객체 생성
    Character character1 = new Character("전사", 25, "난무");
 */

import java.util.Scanner;

class Character {
    // 필드
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;

    // 생성자
    Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;
        this.exp = 0;
    }

    public int getHealth() {
        return health;
    }

    public void attack(String monster) {
        int amount = switch (monster) {
            case "slime" -> 10;
            case "skeleton" -> 20;
            case "goblin" -> 30;
            case "dragon" -> 5000;
            default -> 0;
        };

        if (amount == 0) {
            System.out.println("공격 대상이 존재하지 않습니다.");
        } else {
            System.out.println(name + "이(가) " + power + "로 " + monster + "을(를) 공격!");
            System.out.println(name + "이(가) 경험치 " + amount + "을(를) 얻었습니다.");
            gainExp(amount);    // 메서드 내부에서 메서드를 호출
        }
    }

    public void heal() {
        health += 10;
        System.out.println("체력이 10 회복되었습니다. 현재 체력 : " + getHealth());
    }

    private void gainExp(int amount) {  // private 메서드는 해당 메서드가 정의된 class 내부에서만 사용 가능하다
        exp += amount;
    }

    public void showInfo() {
        System.out.println("캐릭터 이름 : " + name);
        System.out.println("체력 : " + health);
        System.out.println("공격력 : " + power);
        System.out.println("보유 스킬 : " + skill);
        System.out.println();
    }
}

public class Review13Summary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character character1 = new Character("전사", 25, "난무");
        int select;


        character1.showInfo();

        System.out.println("공격할 몬스터를 결정하시오.");
        System.out.println("1. slime\t2. skeleton\t 3.goblin\t4. dragon");
        select = scan.nextInt();

        String monster = switch (select) {
            case 1 -> "slime";
            case 2 -> "skeleton";
            case 3 -> "goblin";
            case 4 -> "dragon";
            default -> "";
        };

        character1.attack(monster);
        /*
            공격할 몬스터를 결정하시오.
            1. slime	2. goblin	 3.skeleton	4. dragon
            3
            전사이(가) 25로 skeleton을(를) 공격!
            전사이(가) 경험치 20을(를) 얻었습니다.    -> attack() 메서드 내에 있는 gainExp()가 호출
         */

        System.out.println();
        character1.heal();
    }
}
