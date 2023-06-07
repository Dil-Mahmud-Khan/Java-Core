import jdk.jfr.RecordingState;

public class Rectangle extends Shape{
    private  double y;
    public Rectangle(){
        System.out.println("Empty");
    }
    public Rectangle(double x,double y){
        super(x);
        this.y=y;
        System.out.println("Parameterized");
    }

    public void setY(double y){this.y=y;}
    public double getY(){return y;}
    public double getArea(){
        return x*y;
    }
    public void showDetails(){
        System.out.println("X:"+getX());
        System.out.println("Y:"+getY());
        System.out.println("Area:"+getArea());
    }
}
