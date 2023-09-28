package bank2;
public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    
    public CheckingAccount(String name, int balance, String id){
    this.name = name;
    this.balance = balance;
    this.id = id;
    }
    
    public int getBalance(){
    return this.balance;    
    }
    
    public void setBalance(int newBalance){
    this.balance = newBalance;
    }
}