package com.example.trafficlight;

import javafx.scene.paint.Color;

import static java.lang.Thread.sleep;

public class Monitor {

    private final int SLEEP_TIME = 200;

    private final int FLASHING_LIGHT_NUMBER = 5;


    public synchronized void displayLights(TrafficLight upperLight, TrafficLight lowerLight, TrafficLight rightLight, TrafficLight leftLight) {
        try {
            while (true) {
                setTrafficLights(rightLight, leftLight, upperLight, lowerLight);
                setTrafficLights(upperLight, lowerLight, rightLight, leftLight);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void setTrafficLights(TrafficLight light1, TrafficLight light2, TrafficLight light3, TrafficLight light4) throws InterruptedException {
        parallelLightsGreenForCars(light1, light2);
        parallelLightsGreenForPeople(light3, light4);
    }

    private void carRedLight(TrafficLight light) {
        light.getCarRedLight().setFill(Color.RED);
        light.getCarGreenLight().setFill(Color.GREY);
        light.getPeopleRedLight().setFill(Color.GREY);
    }

    private void parallelLightsGreenForPeople(TrafficLight light1, TrafficLight light2) throws InterruptedException {
        carRedLight(light1);
        carRedLight(light2);
        peopleGreenLightFlashing(light1, light2);
    }

    private void parallelLightsGreenForCars(TrafficLight light1, TrafficLight light2) {
        peopleRedLight(light1);
        peopleRedLight(light2);
    }

    private void peopleRedLight(TrafficLight light) {
        light.getCarRedLight().setFill(Color.GREY);
        light.getCarGreenLight().setFill(Color.GREEN);

        light.getPeopleRedLight().setFill(Color.RED);
        light.getPeopleGreenLight().setFill(Color.GREY);
    }


    private void peopleGreenLightFlashing(TrafficLight light1, TrafficLight light2) throws InterruptedException {
        for (int j = 0; j < FLASHING_LIGHT_NUMBER; j++) {
            colorPeopleGreenLightToGreen(light1, light2);
            sleep(SLEEP_TIME);
            colorPeopleGreenLightToGrey(light1, light2);
            sleep(SLEEP_TIME);
        }
    }

    private void colorPeopleGreenLightToGreen(TrafficLight light1, TrafficLight light2) {
        light1.getPeopleGreenLight().setFill(Color.GREEN);
        light2.getPeopleGreenLight().setFill(Color.GREEN);
    }

    private void colorPeopleGreenLightToGrey(TrafficLight light1, TrafficLight light2) {
        light1.getPeopleGreenLight().setFill(Color.GREY);
        light2.getPeopleGreenLight().setFill(Color.GREY);
    }
}