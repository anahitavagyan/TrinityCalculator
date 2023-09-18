package edu.trinity;

import java.time.Year;

public class Car {

    private String make;
    private String model;
    private Year year;
    //variables
    boolean running = false;
    int totalMiles = 0;

    public Car(String make, String model, Year year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    public boolean isRunning() {
        return running;
    }

    public void start() {
        if (isRunning()==true){
            return;
        }else{
            running=true;
        }
    }

    public void stop() {
        if (isRunning()==false){
            return;
        }else{
            running=false;
        }
    }

    public void drive(int distance) {
        totalMiles+=distance;
    }

    public int getMiles() {

        return totalMiles;
    }
}
