package com.example.burge.mpp1;

/**
 * Created by java on 28.08.2017.
 */

public class CarTwo implements Car {
    String color;
    int speed;

    public CarTwo(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public int speed() {
        return speed;
    }
}
