package main;
public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    
    car.setCompany_name("Chevrolet");
    car.setModel_name("cruze");
    car.setYear(2009);
    
        System.out.println("Company name:"+car.getComany_name());
        System.out.println("Model name:"+car.getModel_name());
        System.out.println("Year:"+car.getYear());
        System.out.println("Mileage:"+car.getMileage());
    }
    
}
