import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CircleTester {
    public static int count = 0;
    static ArrayList<Circle> circles = new ArrayList<Circle>();

    public static void addCirtcle(double x, double y){
        Circle n = new Circle();
        n.setCenterX(x);
        n.setCentreY(y);
        circles.add(n);
        count+=1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X centre:");
        double cen_x = input.nextDouble();
        System.out.println("Enter Y centre:");
        double cen_y = input.nextDouble();
        addCirtcle(cen_x, cen_y);
        System.out.println(circles);
    }
}
