package condicionalejemplo3;
public class CondicionalEjemplo3 {
    public static void main(String[] args) {
    int nota = 81;
    
    if(nota<50){
        System.out.println("Perdio");}
    else if(nota>=50 && nota<60){
        System.out.println("D");}
    else if(nota>=60 && nota<70){
        System.out.println("C");}
    else if(nota>=70 && nota<80){
        System.out.println("B");}
    else if(nota>=80 && nota<90){      
        System.out.println("A");}
    else if(nota>=90 && nota<=100){
        System.out.println("A+");}
    else{
        System.out.println("Numero no valido.");} 
    }  
}
