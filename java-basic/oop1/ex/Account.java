package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance+=amount;
        System.out.println("잔액: " + balance);
    }
    void withdraw(int amount){
        if(balance-amount>=0){
            balance-=amount;
        }else{
            System.out.println("잔액부족");
        }
        System.out.println("잔액: " + balance);
    }
}