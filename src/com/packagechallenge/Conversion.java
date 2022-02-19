package com.packagechallenge;

public class Conversion  {

    private int seconds;
    private int second = this.seconds%60;

    public Conversion(int seconds) {
        this.seconds = seconds;
    }


    public int getSecond() {
        return second;
    }

    public int secondsToMinutes() {
        return ((seconds-second)/60)%60;
    }

    public int secondsToHours() {
        return (seconds-second-secondsToMinutes()*60)/3600;
    }
}
