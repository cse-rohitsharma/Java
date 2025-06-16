import java.util.Scanner;

public class paint_required {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length, breadth and height of the room");
        int length,breadth,height,paintReq;
        double areaWall,areaRoof,rate,cost,totalArea;
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        areaWall = 2*(length*height) + 2*(breadth*height);
        areaRoof = breadth*length;
        System.out.println(areaRoof);
        System.out.println(areaWall);

        System.out.println("Kindly enter total paint required to paint 1 sq unit of room, in grams");
        paintReq = sc.nextInt();
        System.out.println("Now enter the rate of 1 gram of paint");
        rate = sc.nextInt();
        totalArea = areaRoof+areaWall;
        System.out.println(totalArea);
        cost = (totalArea) * (paintReq * rate);
        System.out.println("So the total cost to paint the room will be " + cost);
    }
}
