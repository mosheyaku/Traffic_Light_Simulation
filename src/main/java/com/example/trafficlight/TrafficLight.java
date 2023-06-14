package com.example.trafficlight;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TrafficLight {

    private Rectangle peopleRedLight;
    private Rectangle peopleGreenLight;
    private Circle carRedLight;
    private Circle carGreenLight;


    public TrafficLight(Circle carRedLight, Circle carGreenLight, Rectangle peopleRedLight, Rectangle peopleGreenLight) {
        this.peopleRedLight = peopleRedLight;
        this.peopleGreenLight = peopleGreenLight;
        this.carRedLight = carRedLight;
        this.carGreenLight = carGreenLight;
    }

    public Rectangle getPeopleRedLight() {
        return peopleRedLight;
    }

    public void setPeopleRedLight(Rectangle peopleRedLight) {
        this.peopleRedLight = peopleRedLight;
    }

    public Rectangle getPeopleGreenLight() {
        return peopleGreenLight;
    }

    public void setPeopleGreenLight(Rectangle peopleGreenLight) {
        this.peopleGreenLight = peopleGreenLight;
    }

    public Circle getCarRedLight() {
        return carRedLight;
    }

    public void setCarRedLight(Circle carRedLight) {
        this.carRedLight = carRedLight;
    }

    public Circle getCarGreenLight() {
        return carGreenLight;
    }

    public void setCarGreenLight(Circle carGreenLight) {
        this.carGreenLight = carGreenLight;
    }
}
