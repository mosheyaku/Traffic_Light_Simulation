package com.example.trafficlight;

import javafx.scene.paint.Color;

import static java.lang.Thread.sleep;

public class Monitor {

    private final int SLEEP_TIME = 200;

    private final int FLASHING_LIGHT_NUMBER = 5;


    public synchronized void displayLights(TrafficLight upperLight, TrafficLight lowerLight, TrafficLight rightLight, TrafficLight leftLight) {
        try {
            while (true) {
                parallelLightsGreenForCars(rightLight, leftLight);
                parallelLightsGreenForPeople(upperLight, lowerLight);

                parallelLightsGreenForCars(upperLight, lowerLight);
                parallelLightsGreenForPeople(rightLight, leftLight);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void parallelLightsGreenForPeople(TrafficLight light1, TrafficLight light2) throws InterruptedException {

        light1.getCarRedLight().setFill(Color.RED);
        light1.getCarGreenLight().setFill(Color.GREY);

        light2.getCarRedLight().setFill(Color.RED);
        light2.getCarGreenLight().setFill(Color.GREY);

        light1.getPeopleRedLight().setFill(Color.GREY);
        light2.getPeopleRedLight().setFill(Color.GREY);

        peopleGreenLightFlashing(light1, light2);
    }

    private void parallelLightsGreenForCars(TrafficLight light1, TrafficLight light2){
        light1.getCarRedLight().setFill(Color.GREY);
        light1.getCarGreenLight().setFill(Color.GREEN);

        light1.getPeopleRedLight().setFill(Color.RED);
        light1.getPeopleGreenLight().setFill(Color.GREY);

        light2.getCarRedLight().setFill(Color.GREY);
        light2.getCarGreenLight().setFill(Color.GREEN);

        light2.getPeopleRedLight().setFill(Color.RED);
        light2.getPeopleGreenLight().setFill(Color.GREY);
    }


    private void peopleGreenLightFlashing(TrafficLight light1, TrafficLight light2) throws InterruptedException {
        for (int j = 0; j < FLASHING_LIGHT_NUMBER; j++) {
            light1.getPeopleGreenLight().setFill(Color.GREEN);
            light2.getPeopleGreenLight().setFill(Color.GREEN);
            sleep(SLEEP_TIME);
            light1.getPeopleGreenLight().setFill(Color.GREY);
            light2.getPeopleGreenLight().setFill(Color.GREY);
            sleep(SLEEP_TIME);
        }
    }
}
