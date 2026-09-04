package CSA;
/*
* Write a class called Rectangle with:

Two private fields: width and height (both double)
A no-argument constructor that defaults to a 1.0 × 1.0 square
A constructor that takes one parameter (a side length) and creates a square
A constructor that takes two parameters (width, height) and creates a rectangle
A method area() that returns the area
A method perimeter() that returns the perimeter
* */
public class rectanglePractice {

    private double height;
    private double width;


    public rectanglePractice(double high, double wid) {
        width = wid;
        height = high;
    }

    public rectanglePractice(double sidelength){
        width = sidelength;
        height = sidelength;
    }

    public rectanglePractice(){
        width = 1.0;
        height = 1.0;
    }

    public double area() {

        return width * height;
    }

    public double perimiter(){
        return 2 * width + 2 * height;
    }


    public static void main (String[] args) {
        rectanglePractice rect1 = new rectanglePractice();
        rectanglePractice rect2 = new rectanglePractice(4.0, 5.0);
        rectanglePractice rect3 = new rectanglePractice(5.0);

        System.out.println("Area of rectangle 1 is " + rect1.area() + "and the perimiter is " + rect1.perimiter());
        System.out.println("Area of rectangle 2 is " + rect2.area() + "and the perimiter is " + rect2.perimiter());


    }

}
