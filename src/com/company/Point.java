package com.company;

public class Point {
    private int y;
    private int x;

    public Point(){
    }

    public Point(int x,int y){
        this.y=y;
        this.x=x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double distance(){
        return Math.sqrt((0-0)*(0-0) + (y-x)* (y-x));
    }
}
