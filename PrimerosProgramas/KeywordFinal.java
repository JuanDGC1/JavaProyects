package keywordfinal;
public class KeywordFinal {
    public static void main(String[] args) {
    final double pi = 3.14;
    System.out.println(pi);
    pi = 2*pi; // con la keyword "final" hace que sea constante y no permita ningun tipo de cambio
    System.out.println(pi);
    }
    
}
