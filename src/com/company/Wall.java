package com.company;

public class Wall {

    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height){
        if(width<0){
            this.width=0;
        }
        else if(height<0){
            this.height=0;
        }
        else {

            this.height = height;
            this.width = width;
        }

    }
}
