package com.example.trafficlight;

public class TrafficControl extends Thread {

    private TrafficLight upperLight;
    private TrafficLight lowerLight;
    private TrafficLight rightLight;
    private TrafficLight leftLight;
    private Monitor monitor;

    public TrafficControl(TrafficLight upperLight, TrafficLight lowerLight, TrafficLight rightLight, TrafficLight leftLight, Monitor monitor) {
        this.upperLight = upperLight;
        this.lowerLight = lowerLight;
        this.rightLight = rightLight;
        this.leftLight = leftLight;
        this.monitor = monitor;
    }

    public void run() {
        super.run();
        monitor.displayLights(upperLight, lowerLight, rightLight, leftLight);
    }
}
