import java.util.*;
class Area {

  public static void main(String[] args) {


    areaSquare();
    areaTriangle();
    areaRectangle();
    areaCircle();


    System.out.println(area1);
    System.out.println(area2);
    System.out.println(area3);
    System.out.println(area4);

  }


    public static void areaSquare(){

		System.out.println("Write the side of the square");
		int side = area.nextInt();
		int area1 = side * side;
    return(area1);

	}



    public static void areaTriangle(){
		System.out.println("What's the base of the triangle");
		int base = area.nextInt();
		System.out.println("What's the height of the triangle");
		int height = area.nextInt();
		int area2 = ((base * height)/2);
    return(area2);

	}



  public static void areaRectangle(){
		System.out.println("What's the width of the triangle");
		int width = area.nextInt();
		System.out.println("What's the Length of the triangle");
		int Length = area.nextInt();
		int area3 = width * Length;
    return(area3);

    }



    public static void areaCircle(){
	  System.out.println("What's the radius of the circle");
		double radius = area.nextDouble();
    double area4 = Math.PI * Math.pow(radius, 2);
    return area4;
	
  }

}
