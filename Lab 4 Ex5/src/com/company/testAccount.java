package com.company;

public class testAccount{
    private static int balance;
    private static int maxTransfer;

    public void account(int balance, int maxTransfer){
    setBalance(balance);
    setMaxTransfer(maxTransfer);
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setMaxTransfer(int maxTransfer){
        this.maxTransfer = maxTransfer;
    }
    public int getMaxTransfer(){
        return maxTransfer;
    }

    public void withdraw(int amount){
        try{
        chkWithdraw(amount);
        }catch (insufficientFundException IFE){
            System.out.println(IFE.getMessage());
        }
    }

    public void transfer(int amount,int accNo){
        try{
            chkTransfer(amount);
        } catch (maximumFundTransferException MFTE) {
            System.out.println(MFTE.getMessage());
            System.out.println("Maximum transfer is "+getMaxTransfer());
        }

    }
    //Comparing to throw exception or not.
    public void chkWithdraw(int amount) throws insufficientFundException{
        if(amount>balance){
            String message = "insufficientFundException";
            throw new insufficientFundException(message);
        }else {
            balance -= amount;
        }
    }
    public void chkTransfer(int amount) throws maximumFundTransferException{
        if(amount<=maxTransfer){
            balance += amount;
        }
        else{
            String message = "maximumFundTransferException";
            throw  new maximumFundTransferException(message);
        }
    }
}

class insufficientFundException extends Exception {
    public insufficientFundException(String message){
    super(message);
    }
}

class maximumFundTransferException extends Exception{
    public maximumFundTransferException(String message){
        super(message);
    }
}


