package com.company;

public abstract class  Vehicle {

    private boolean hasSteering;
    private int speed;

    public void increasingSpeed(int speed){
        if (speed<0){
            this.speed+=0;
        }
        else {
            this.speed += speed;
        }

        System.out.println("The new increased speed is:" + this.speed);
    }

    public void decreasedSpeed(int speed){
        if (speed<0){
            this.speed-=0;
        }
        else{
            this.speed-=speed;
        }
        System.out.println("The new decreased speed is:" + this.speed);
    }

}
