package access;

import java.lang.invoke.LambdaMetafactory;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance=0;
    }

    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance+=amount;
        }else{
            System.out.println("유효하지 않은 금액");
        }
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance-amount>=0){
            System.out.println("유효하지 않은 금액이거나 잔액 부족");
        }
    }

    public int getBalance(){
        return balance;
    }
}
