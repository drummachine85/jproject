package edu.jcourse.lesson2.datatypes.lesson4;

class Vechicle {
    String name;
    int passengers;  // sozdanie svoistva klassa
    int tank;
    float fuelPer100km;

    public Vechicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

   Vechicle() {
        System.out.println("Vihicle initialaized.");
    }

    void distance(){
        float distance = (tank*100)/fuelPer100km;
        System.out.println("Distance for "+name+" is " +distance+"km");
    }
}
