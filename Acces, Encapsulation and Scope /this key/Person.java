package person;
public class Person {
    private int age;
    private int wisdom;
    private int fitness;
    
    public Person(int age){
     this.age = age;
     this.wisdom = age*5;
     this.fitness = 100-age;
    }
    
    public void setAge(int age){
     this.age = age;
    }
    
    public void setWisdom(int wisdom){
     this.wisdom = wisdom;
    }
    
    public void setFitness(int fitness){
     this.fitness = fitness;
    }
    
    public void hasBirthday(){
     this.setAge(this.age+1);
     this.setWisdom(this.wisdom+5);
     this.setFitness(this.fitness-3);
    }
    
    public static void main(String[] args){
    Person emily = new Person(20);
    emily.hasBirthday();
        System.out.println("New age is:"+emily.age);
        System.out.println("New wisdom is:"+emily.wisdom);
        System.out.println("New fitness is:"+emily.fitness);
    }
}
