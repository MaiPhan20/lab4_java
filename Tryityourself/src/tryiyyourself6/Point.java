package tryiyyourself6;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    void giaTriX(int X) {
        System.out.println(this.x + "Giá trị của X");

    }

    void giaTriY(int Y) {
        System.out.println(this.y + "Giá trị của Y");

    }




}



