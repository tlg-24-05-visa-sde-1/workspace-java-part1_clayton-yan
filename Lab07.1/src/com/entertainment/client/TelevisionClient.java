package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(Television.MIN_VOLUME);
        tv1.setBrand("Samsung");
        tv1.setDisplay(DisplayType.CRT);

        Television tv2 = new Television("Apple", 3);
        tv2.setVolume(Television.MAX_VOLUME);

        Television tv3 = new Television("Sony");

        System.out.println(Television.getInstanceCount() + " instances");

        Television tv4 = new Television("Sony", 45, DisplayType.CRT);
        System.out.println(tv4);

        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
    }
}
