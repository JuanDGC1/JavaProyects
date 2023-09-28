package relacionesdeoperacion;
public class RelacionesDeOperacion {
    public static void main(String[] args) {
    double CreditosObtenidos=176.5;
    double CreditosDeSeminario=8;
    double CreditosParaGraduarse=180;
    double CreditosDespuesDeSeminario=CreditosDeSeminario+CreditosObtenidos;
        System.out.println(CreditosObtenidos > CreditosParaGraduarse);
        System.out.println(CreditosParaGraduarse < CreditosDespuesDeSeminario);
    }
    
}
