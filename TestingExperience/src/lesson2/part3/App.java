package lesson2.part3;

import java.util.Arrays;


public class App  {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        double[] fig = new double[4];

        fig[0] = circle.area(4, 3.14);
        fig[1] = square.area(36, 36);
        fig[2] = triangle.area(15, 26);
        fig[3] = fig[0]+fig[1]+fig[2];

        System.out.println(fig[3]);

    }
// так і не зміг розібратися як зробити це через метод
}

