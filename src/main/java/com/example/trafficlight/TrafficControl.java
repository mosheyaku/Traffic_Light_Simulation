package com.example.trafficlight;

public class TrafficControl extends Thread {

    private TrafficLight upperLight;
    private TrafficLight lowerLight;
    private TrafficLight rightLight;
    private TrafficLight leftLight;

    public TrafficControl(TrafficLight upperLight, TrafficLight lowerLight, TrafficLight rightLight, TrafficLight leftLight) {
        this.upperLight = upperLight;
        this.lowerLight = lowerLight;
        this.rightLight = rightLight;
        this.leftLight = leftLight;
    }

    public void run() {
        super.run();
    }
}
