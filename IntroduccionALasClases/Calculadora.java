package calculadora;
public class Calculadora {
    public int adicion(int a, int b){
    return a+b;}
    public int substraccion(int a, int b){
    return a-b;}
    public int multiplicacion(int a, int b){
    return a*b;}
    public int division(int a, int b){
    return a/b;}
    public int modulo(int a, int b){
    return a%b;}
    
    public static void main(String[] args) {
    Calculadora calcular= new Calculadora();
        System.out.println(calcular.adicion(5,7));
        System.out.println(calcular.substraccion(45, 11));
        System.out.println(calcular.multiplicacion(3, 2));
    }
}
