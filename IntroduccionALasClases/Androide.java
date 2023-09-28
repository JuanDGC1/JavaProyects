package androide;
public class Androide {
    int bateria;
    String nombre;
    
    public Androide(String nombreAndroide){
    bateria = 100;
    nombre = nombreAndroide;
    }
    
    public String toString(){
    return "Hola, soy un androide, mi nombre es: "+nombre;
    }
    
    public void hacer(String accion){
        System.out.println(nombre + " esta "+ accion);
    }
    
    public void bateriaAbajo(){
    bateria -= 10;
    }
    
    public void reportarEnergia (){
        System.out.println(bateria);
    }
    
    public static void main(String[] args) {
    Androide Miguel=new Androide("Miguel");
        System.out.println(Miguel.toString());
        Miguel.hacer("leyendo");
        Miguel.bateriaAbajo();
        Miguel.reportarEnergia();
    }
}
