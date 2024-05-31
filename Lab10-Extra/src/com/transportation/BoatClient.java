package com.transportation;

public class BoatClient {
    public static void main(String[] args) {
        Boat boat = new Boat("BIG BOATY");
        try {
            boat.moveTo("SF");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
