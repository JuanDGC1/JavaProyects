package person;
public class SavingsAccount {
    private String owner;
    private int balanceDollar;
    private double balanceEuro;
    
    public SavingsAccount(String owner, int balanceDollar){
     this.owner = owner;
     this.balanceDollar = balanceDollar;
     this.balanceEuro = balanceDollar*0.85;
    }
    
    public void addMoney(int balanceDollar){
        System.out.println("Adding "+balanceDollar+" dollars to the accopunt");
    }
   
    public static void main(String[] args) {
     SavingsAccount zeusSavingsAccount = new SavingsAccount("zeus", 1000);
     
     zeusSavingsAccount.addMoney(2000);
    }
    
}