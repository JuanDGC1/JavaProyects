package bank2;
public class Bank2 {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
            
public Bank2(){
 accountOne = new CheckingAccount("Hercules", 106, "1");
 accountTwo = new CheckingAccount("Poseidon", 999, "2");
}
    public static void main(String[] args) {
    Bank2 bankOfGods = new Bank2();
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(5000);
        System.out.println(bankOfGods.accountOne.getBalance());
        System.out.println(bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.setBalance(5070);
        System.out.println(bankOfGods.accountTwo.getBalance());
    }
    
}
