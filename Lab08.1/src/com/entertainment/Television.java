package com.entertainment;

import java.util.Arrays;

/*
 * App class to model the TV
 */
public class Television {

    // static
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;
    private static DisplayType display = DisplayType.LED;
    // instance var/fields
    private String brand;
    private int volume;
    // muted state
    private boolean isMuted;
    // used to restore old volume when unmuting
    private int oldVolume;

    // Television HAS-A Tuner
    private final Tuner tuner = new Tuner(); // instantiated iternally, NOT exposed


    public boolean isMuted() {
        return isMuted;
    }

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this(); // delegate up to no arg constructor
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // Getter and setters

    public static DisplayType getDisplay() {
        return display;
    }

    public static void setDisplay(DisplayType display) {
        Television.display = display;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n", volume, MIN_VOLUME, MAX_VOLUME);
            // System.out.println("Volume:" + volume + " out of bounds for range" + MIN_VOLUME + "-" + MAX_VOLUME);
        } else {
            this.volume = volume;
            isMuted = false;
        }
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.printf("in setBrand, Brand: %s is invalid, must be %s\n", brand, Arrays.toString(VALID_BRANDS));
        }

    }

    // methods

    // only returns boolean no setting
    private static boolean isValidBrand(String brand) {
        boolean isValid = false;

        for (String tvBrand: VALID_BRANDS) {
            if (tvBrand.equals(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }



    public void turnOff() {
        System.out.println("Shutting down ... goodbye");
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // methods for tuner
    public void changeChannel(String channel) {
        tuner.setChannel(channel);
    }

    public String getCurrentChannel() {
        return tuner.getChannel(); // delegate to tuner object for the actual work
    }

    @Override
    public String toString() {

        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Television: brand=%s, volume=%s, display=%s, currentChannel=%s", getBrand(), volumeString, getDisplay(), getCurrentChannel());

        /*
        return "Television{" +
                "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() + '\'' +
                ", DisplayType=" + getDisplay() + '\'' +
                '}';
         */
    }

    // mute method
    public void mute() {
        if (!isMuted()) {
            // currently not muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;


        } else {
            // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }

    }
}