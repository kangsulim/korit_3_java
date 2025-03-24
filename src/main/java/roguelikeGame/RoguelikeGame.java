package roguelikeGame;

import java.io.*;
import java.util.Scanner;

class Character {
    private String name;
    private int health;
    private int power;
    private String skill;
    private int exp;
    private int level;

    // 생성자
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;
        this.exp = 0;
        this.level = 1;
    }

    // 체력 Getter
    public int getHealth() {
        return health;
    }

    // 체력 Setter
    public void setHealth(int health) {
        this.health = Math.max(0, health);
    }

    // 경험치 Getter
    public int getExp() {
        return exp;
    }

    // 경험치 Setter
    public void gainExp(int amount) {
        exp += amount;
        checkLevelUp();
    }

    // 공격 메서드
    public void attack(String monster) {
        int expGain = switch (monster) {
            case "slime" -> 15;
            case "skeleton" -> 25;
            case "goblin" -> 35;
            case "dragon" -> 100;
            default -> 0;
        };

        if (expGain == 0) {
            log("공격 대상이 존재하지 않습니다.");
        } else {
            log(name + "이(가) " + power + "의 공격력으로 " + monster + "을(를) " + skill + " 공격!");
            log(name + "이(가) 경험치 " + expGain + "을(를) 얻었습니다.");
            gainExp(expGain);
        }
    }

    // 체력 회복 메서드
    public void heal() {
        setHealth(health + 10);
        log("체력이 10 회복되었습니다. 현재 체력: " + getHealth());
    }

    // 레벨업 체크 (경험치가 충분할 경우 연속적으로 레벨업)
    private void checkLevelUp() {
        while (exp >= level * 50) { // 경험치가 다음 레벨 기준 이상이면 계속 레벨업
            exp -= level * 50; // 경험치 차감
            level++; // 레벨 증가
            log(name + "이(가) 레벨 " + level + "로 상승했습니다!");
        }
    }

    // 캐릭터 정보 출력
    public void showInfo() {
        log("===== 캐릭터 정보 =====");
        log("이름: " + name);
        log("레벨: " + level);
        log("체력: " + health);
        log("공격력: " + power);
        log("스킬: " + skill);
        log("경험치: " + exp);
        log("=====================");
    }

    // 로그 저장
    private void log(String message) {
        System.out.println(message);
        try (FileWriter fw = new FileWriter("log.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("로그 저장 오류: " + e.getMessage());
        }
    }

    // 캐릭터 데이터 저장
    public void saveCharacter() {
        try (FileWriter fw = new FileWriter("character.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(name + "," + health + "," + power + "," + skill + "," + exp + "," + level);
            log("캐릭터 정보가 저장되었습니다.");
        } catch (IOException e) {
            log("저장 오류: " + e.getMessage());
        }
    }

    // 캐릭터 데이터 불러오기
    public static Character loadCharacter() {
        try (BufferedReader br = new BufferedReader(new FileReader("character.txt"))) {
            String line = br.readLine();
            if (line != null) {
                String[] data = line.split(",");
                Character character = new Character(data[0], Integer.parseInt(data[2]), data[3]);
                character.setHealth(Integer.parseInt(data[1]));
                character.exp = Integer.parseInt(data[4]);
                character.level = Integer.parseInt(data[5]);
                logStatic("저장된 캐릭터를 불러왔습니다.");
                return character;
            }
        } catch (IOException e) {
            logStatic("불러오기 오류: " + e.getMessage());
        }
        return null;
    }

    private static void logStatic(String message) {
        System.out.println(message);
        try (FileWriter fw = new FileWriter("log.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(message);
            bw.newLine();
        } catch (IOException ignored) {}
    }
}

public class RoguelikeGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character character;

        System.out.print("저장된 캐릭터를 불러오겠습니까? (Y/N) >>> ");
        String loadChoice = scan.nextLine().toUpperCase();
        if (loadChoice.equals("Y")) {
            character = Character.loadCharacter();
            if (character == null) {
                System.out.println("불러올 데이터가 없습니다. 새 캐릭터를 생성합니다.");
                character = new Character("전사", 25, "난무");
            }
        } else {
            character = new Character("전사", 25, "난무");
        }

        character.showInfo();

        while (true) {
            System.out.println("\n==== 행동 선택 ====");
            System.out.println("1. 몬스터 공격");
            System.out.println("2. 체력 회복");
            System.out.println("3. 캐릭터 정보 보기");
            System.out.println("4. 게임 저장 및 종료");
            System.out.print("선택 : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("공격할 몬스터를 선택하세요:");
                    System.out.println("1. slime\t2. skeleton\t3. goblin\t4. dragon");
                    int monsterChoice = scan.nextInt();
                    String monster = switch (monsterChoice) {
                        case 1 -> "slime";
                        case 2 -> "skeleton";
                        case 3 -> "goblin";
                        case 4 -> "dragon";
                        default -> "";
                    };
                    character.attack(monster);
                }
                case 2 -> character.heal();
                case 3 -> character.showInfo();
                case 4 -> {
                    character.saveCharacter();
                    System.out.println("게임을 저장하고 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
