
//Enter cost of 3 items from the user(usingfloatdatatype) -a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;

public class CostOfThreeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("the total cost is " + cost);
        float newCost = cost + (0.18f * cost);
        System.out.println("cost with 18% GST is " + newCost);

    }
}
