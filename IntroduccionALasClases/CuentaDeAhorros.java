package cuentadeahorros;
public class CuentaDeAhorros {
    int balance;
    
public CuentaDeAhorros(int balanceInicial){
balance = balanceInicial;
}

public void verBalance(){
    System.out.println("Hola");
    System.out.println("su balance es: "+balance);
}

public void depositar(int cantidadDeposito){
balance = balance + cantidadDeposito;
    System.out.println("Acabas de depositar: "+cantidadDeposito);
}

public void retirar(int cantidadRetirar){
balance = balance - cantidadRetirar;
    System.out.println("Acabas de retirar: "+cantidadRetirar);
}

public String toString(){
return "Acabas de dejar tu cuenta con: "+balance;
}

    public static void main(String[] args) {
    CuentaDeAhorros cuenta = new CuentaDeAhorros(2000);
    
    cuenta.verBalance();
    
    cuenta.retirar(300);
    
    cuenta.verBalance();
    
    cuenta.depositar(600);
    
    cuenta.verBalance();
    
    cuenta.depositar(600);
    
        System.out.println(cuenta);
    }
}
