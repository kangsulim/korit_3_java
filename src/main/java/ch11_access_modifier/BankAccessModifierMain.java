package ch11_access_modifier;

import java.sql.SQLOutput;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(1234567,
                "강수림", 10000, 1234);

//        bankAccessModifier1.showInfo();
//        System.out.println();
//
//        bankAccessModifier1.deposit(1000, 4321);
//        System.out.println(bankAccessModifier1.getBalance());
//        System.out.println();
//
//        bankAccessModifier1.deposit(-10, 1234);
//        System.out.println(bankAccessModifier1.getBalance());
//        System.out.println();
//
//        bankAccessModifier1.deposit(2000, 1234);
//        System.out.println(bankAccessModifier1.getBalance());
//        System.out.println();
//
//        bankAccessModifier1.withdraw(100, 1212);
//        System.out.println();
//
//        bankAccessModifier1.withdraw(10000000, 1234);
//        System.out.println();
//
//        bankAccessModifier1.withdraw(100, 1234);
//        System.out.println();

        BankAccessModifier account1 = new BankAccessModifier(123456,
                "홍길동", 100000, 1234);
        BankAccessModifier account2 = new BankAccessModifier(987654,
                "신사임당", 500000, 1234);

        account1.showInfo();
        System.out.println();

        account2.showInfo();
        System.out.println();

        account1.deposit(50000, 1234);
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);
        System.out.println();


        account2.withdraw(100000, 1234);
        account2.deposit(200000, 1234);
        System.out.println();

        account1.showInfo();
        System.out.println();

        account2.showInfo();
    }
}
