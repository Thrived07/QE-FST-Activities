package com.example;

public class Activity3 {
    public static void main(String[] args){
        double seconds=1000000000;
        double EarthSeconds=31557600;
        double MercurySeconds=0.2408467;
        double VenusSeconds=0.61519726;
        double MarsSeconds=1.8808158;
        double JupiterSeconds=11.862615;
        double SaturnSeconds=29.447498;
        double UranusSeconds=84.016846;
        double NeptuneSeconds=164.79132;

        double age=seconds/EarthSeconds;
        System.out.println(age/EarthSeconds);
        System.out.println(age/MercurySeconds);
        System.out.println(age/VenusSeconds);
        System.out.println(age/MarsSeconds);
        System.out.println(age/JupiterSeconds);
        System.out.println(age/SaturnSeconds);
        System.out.println(age/UranusSeconds);
        System.out.println(age/NeptuneSeconds);

    }
}
