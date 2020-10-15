import java.util.*;
class Area {

  public static void main(String[] args) {
    Scanner area = new Scanner (System.in);

    //user input for the sides of square
    System.out.println("Write the side of the square");
		int side = area.nextInt();
    int squ = square(side);

    System.out.println("The area of square is " + squ);


    ///user input for the base and height of triangle
    System.out.println("What's the base of the triangle");
		int base = area.nextInt();
    System.out.println("What's the height of the triangle");
		int height = area.nextInt();
    int tri = triangle(base, height);

    System.out.println("The area of triangle is " + tri);


    ///user input for the width and length of rectangle
    System.out.println("What's the width of the triangle");
		int width = area.nextInt();
		System.out.println("What's the Length of the triangle");
		int Length = area.nextInt();
    int rec = rectangle(width, Length);

    System.out.println("The area of rectangle is " + rec);


    ///user input for the radius of circle
    System.out.println("What's the radius of the circle");
		double radius = area.nextDouble();
    double cir = circle(radius);

    System.out.println("The area of circle is " + cir);


  }


    public static int square(int side){
		  int area1 = side * side;
      return(area1);

	  }

    public static int triangle(int base, int height){

		  int area2 = ((base * height)/2);
      return(area2);

	  }

    public static int rectangle(int width, int Length){
      int area3 = width * Length;
      return(area3);

    }

    public static double circle(double radius){
      double area4 = Math.PI * Math.pow(radius, 2);
      return(area4);

    }

}
