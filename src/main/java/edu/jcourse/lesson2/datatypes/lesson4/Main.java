package edu.jcourse.lesson2.datatypes.lesson4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Vechicle miniVan =new Vechicle();
        miniVan.passengers=7;
        miniVan.tank=70;
        miniVan.fuelPer100km=8.5F;
        miniVan.name="Mini Van";
//        System.out.println("Distance :"+miniVan.distance());
//        System.out.println("MiniVan "+miniVan.passengers+" "+miniVan.tank+" "+miniVan.fuelPer100km);
miniVan.distance();
 Vechicle sedan =new Vechicle("Sedan ",5,60 ,9.5F);

        Vechicle sportCar = new Vechicle();
        sportCar.passengers=2;
        sportCar.tank=50;
        sportCar.fuelPer100km=18.5F;
        sportCar.name="Sport Car";
//        System.out.println("Distance : "+ sportCar.distance());
//        System.out.println("SportCar "+sportCar.passengers+" "+sportCar.tank+" "+sportCar.fuelPer100km);
        sportCar.distance();
    }

}
