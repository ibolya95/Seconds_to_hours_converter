package com.packagechallenge;

public class Conversion  {

    private int seconds;
    private int second;

    public Conversion(int seconds) {
        this.seconds = seconds;
    }

    public int getSecond() {
        return this.seconds%60;
    }

    public int secondsToMinutes() {
        return ((seconds-second)/60)%60;
    }

    public int secondsToHours() {
        return (seconds-second-secondsToMinutes()*60)/3600;
    }
}
