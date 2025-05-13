package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private int globRating;
    private boolean battery;
    private LampType style;

    public Lamp(int globRating, boolean battery, LampType style) {

    }
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobalRating() {
        return globRating;
    }
}
