package ch11_access_modifier;

import java.util.Scanner;

public class BankAccessModifier {
    Scanner scan = new Scanner(System.in);
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public BankAccessModifier(int accountNum) {
        this.accountNum = accountNum;
    }

    public BankAccessModifier(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccessModifier(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void showInfo() {
//        System.out.println(accountHolder + "님의 계좌번호는 " +
//                accountNum + "이며, 현재 잔액은 " + balance + "원입니다.");

        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("현재 잔액 : " +balance);
    }

    public void deposit(int amount, int inputPin) {
        if (inputPin == pinNumber) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
            } else {
                System.out.println("불가능한 입금 금액입니다.");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    public void withdraw(int amount, int inputPin) {
        if (inputPin == pinNumber){
            if (amount > 0) {
                int newBalance;
                newBalance = balance - amount;
                if (newBalance >= 0) {
                    balance = newBalance;
                    System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : "  + balance + "원");
                } else {
                    System.out.print("잔액이 부족합니다. ");
                    System.out.println("현재 잔액 : " + balance + "원");
                    return;
                }
            } else {
                System.out.println("불가능한 출금 금액입니다.");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }
}
