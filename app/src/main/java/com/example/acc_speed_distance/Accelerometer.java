package com.example.acc_speed_distance;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public abstract class Accelerometer implements SensorEventListener {
    protected float lastX;
    protected float lastY;
    protected float lastZ;
    public abstract Point getPoint();
    public void onAccuracyChanged(Sensor arg0, int arg1) {
    }
}