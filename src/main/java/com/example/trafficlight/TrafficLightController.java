package com.example.trafficlight;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TrafficLightController {

    @FXML
    private Circle carLeftGreenLight;

    @FXML
    private Circle carLeftRedLight;

    @FXML
    private Circle carLowerGreenLight;

    @FXML
    private Circle carLowerRedLight;

    @FXML
    private Circle carRightGreenLight;

    @FXML
    private Circle carRightRedLight;

    @FXML
    private Circle carUpperGreenLight;

    @FXML
    private Circle carUpperRedLight;

    @FXML
    private Rectangle peopleLeftGreenLight;

    @FXML
    private Rectangle peopleLeftRedLight;

    @FXML
    private Rectangle peopleLowerGreenLight;

    @FXML
    private Rectangle peopleLowerRedLight;

    @FXML
    private Rectangle peopleRightGreenLight;

    @FXML
    private Rectangle peopleRightRedLight;

    @FXML
    private Rectangle peopleUpperGreenLight;

    @FXML
    private Rectangle peopleUpperRedLight;

    private TrafficLight upperLight;
    private TrafficLight lowerLight;
    private TrafficLight rightLight;
    private TrafficLight leftLight;
    private Monitor monitor;


    public void initialize() {
        upperLight = new TrafficLight(carUpperRedLight, carUpperGreenLight, peopleUpperRedLight, peopleUpperGreenLight);
        lowerLight = new TrafficLight(carLowerRedLight, carLowerGreenLight, peopleLowerRedLight, peopleLowerGreenLight);
        rightLight = new TrafficLight(carRightRedLight, carRightGreenLight, peopleRightRedLight, peopleRightGreenLight);
        leftLight = new TrafficLight(carLeftRedLight, carLeftGreenLight, peopleLeftRedLight, peopleLeftGreenLight);
        monitor = new Monitor();
        TrafficControl runLights = new TrafficControl(upperLight, lowerLight, rightLight, leftLight, monitor);
        runLights.start();
    }
}
