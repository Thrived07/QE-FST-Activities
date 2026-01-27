package com.example;

import java.util.ArrayList;
import java.util.Date;

class Plane{
    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){
        this.maxPassengers=maxPassengers;
        this.passengers=new ArrayList<>();
    }
    public void onboard(String name){
        if (passengers.size() < maxPassengers){
            passengers.add(name);
        }else{
            System.out.println("Plane is full. Cannot add"+name);
        }
    }
    public Date takeOff(){
        return new Date();
    }
    public void land(){
        lastTimeLanded=new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public ArrayList<String>getPassengers(){
        return passengers;
    }

}
public class Activity6 {
    public static void main(String args[]) throws InterruptedException{
        Plane plane=new Plane(10);
        plane.onboard("John");
        plane.onboard("Alice");
        plane.onboard("Robert");
        plane.onboard("Emma");
        System.out.println("Take-off time:"+plane.takeOff());
        System.out.println("Passengers onboard:"+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landing time:"+plane.getLastTimeLanded());
    }
}
