import java.util.*;

class Area {

  public static void main(String[] args) {


    Scanner area = new Scanner (System.in);
    System.out.println("Choose type of conversion \n 1.Square  \n 2.Triangle \n 3.Rectangle \n 4.Circle");
    int b = area.nextInt();


    if(b == 1) {

      System.out.println("Write the side of the square");
      int side = area.nextInt();
      int area1 = side * side;
      System.out.println(area1);}


      else if(b == 2) {
        System.out.println("What's the base of the triangle");
        int base = area.nextInt();
        System.out.println("What's the height of the triangle");
        int height = area.nextInt();
        int area2 = ((base * height)/2);
        System.out.println(area2);}


        else if(b == 3) {
          System.out.println("What's the width of the triangle");
          int width = area.nextInt();
          System.out.println("What's the Length of the triangle");
          int Length = area.nextInt();
          int area3 = width * Length;
          System.out.println(area3);}


          else (b == 4) {
            System.out.println("What's the radius of the circle");
            double radius = area.nextDouble();
            //System.out.println("what's the value of pi");
            //int pi = area.nextInt();
            double area4 = Math.pi* (radius * radius);
            //int area4 = (22 / 7(radius * radius));
            System.out.println(area4);}






          }














    }
