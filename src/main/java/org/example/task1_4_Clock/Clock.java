package org.example.task1_4_Clock;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getSeconds() {
        return seconds;
    }

    public void tick() {
        if (this.getSeconds() == 59) {
            this.setSeconds(0);
            if (this.getMinutes() == 59) {
                this.setHours(this.hours + 1);
                this.setMinutes(0);
            } else {
                this.setMinutes(this.minutes + 1);
            }
        } else {
            this.setSeconds(this.seconds + 1);
        }


    }

    @Override
    public void readTime() {
        System.out.println(this.getHours() + ":" + this.getMinutes() + ":" +  this.getSeconds());
    };

}
