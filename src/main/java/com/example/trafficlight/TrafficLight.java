package com.example.trafficlight;

import javafx.scene.shape.Circle;

public class TrafficLight{

    private Circle peopleRedLight;
    private Circle peopleGreenLight;
    private Circle carRedLight;
    private Circle carGreenLight;


    public TrafficLight(Circle peopleRedLight, Circle peopleGreenLight, Circle carRedLight, Circle carGreenLight){
        this.peopleRedLight=peopleRedLight;
        this.peopleGreenLight=peopleGreenLight;
        this.carRedLight=carRedLight;
        this.carGreenLight=carGreenLight;
    }

    public Circle getPeopleRedLight() {
        return peopleRedLight;
    }

    public void setPeopleRedLight(Circle peopleRedLight) {
        this.peopleRedLight = peopleRedLight;
    }

    public Circle getPeopleGreenLight() {
        return peopleGreenLight;
    }

    public void setPeopleGreenLight(Circle peopleGreenLight) {
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
