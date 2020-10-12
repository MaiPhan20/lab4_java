package tryiyyourself6;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        points[0]=getPoints();
        points[1]=getPoints();

        System.out.println(points[0]);

        System.out.println(points[1]);
        if (points[0]==points[0]) {
            System.out.println("Giống Nhau");
        } else {
            System.out.println("Khác Nhau");
        }

    }

    public static Point getPoints() {
        Point s = null;
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("X: ");
        x = sc.nextInt();
        System.out.println("Y: ");
        y=sc.nextInt();
        s=new Point(x,y);
        return s;

    }

}

