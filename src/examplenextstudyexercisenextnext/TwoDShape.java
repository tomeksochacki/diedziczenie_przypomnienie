package examplenextstudyexercisenextnext;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(){
        width = height = 0.0;
    }

    TwoDShape(double w, double h){
        this.width = w;
        this.height = h;
    }

    TwoDShape(double x){
        width = height = x;
    }

    void showDim(){
        System.out.println("Width and height equal: " + width + "and "+ height);
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }

    double getHeight(){
        return height;
    }

    void setHeight(double height){
        this.height = height;
    }
}

class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        this.style = "indefinite";
    }

    Triangle(String s, double w, double h){
        super(w, h);
        this.style = s;
    }

    Triangle(double x){
        super(x);
        style = "full";
    }

    double area(){
        return getWidth() * getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle are: " + style);
    }
}

class Shapes{
    public static void main(String[] args) {
    Triangle t0 = new Triangle();
    Triangle t1 = new Triangle("full", 4.0, 4.0);
    Triangle t2 = new Triangle(4.0);

    t0 = t1;

    /*t1.setHeight(4);
    t1.setWidth(4);
    t1.style = "full";

    t2.setHeight(8);
    t2.setWidth(12);
    t2.style = "empty";*/

    System.out.println("Information with t1: ");
    t1.showStyle();
    t1.showDim();
    System.out.println("Area is: " + t1.area());

    System.out.println();

    System.out.println("Description t2: ");
    t2.showStyle();
    t2.showDim();
    System.out.println("Area is: " + t2.area());

    System.out.println();

    System.out.println("Description t0: ");
    t0.showStyle();
    t0.showDim();
    System.out.println("Area is: " + t0.area());

    /*TwoDShape twoDShape1 = new TwoDShape();
    twoDShape1.setHeight(10);
    twoDShape1.showDim();

    System.out.println();

    Rectangle rectangle1 = new Rectangle();
    //rectangle1.height = 3.0;
    //rectangle1.width = 3.0;
        System.out.println(rectangle1.isSquare());
        System.out.println(rectangle1.area());*/

    }
}

class Rectangle extends TwoDShape{

    Rectangle(final double w, final double h) {
        super(w, h);
    }

    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth()*getHeight();
    }
}





