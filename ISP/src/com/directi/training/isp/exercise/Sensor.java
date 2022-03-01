package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ISensor sensorClient)
    {
        while (true) {
            if (isPersonClose()) {
                sensorClient.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
