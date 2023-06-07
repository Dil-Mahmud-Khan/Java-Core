public class Triangle extends Shape {
    private double y;
    public  Triangle(){
        System.out.println("Empty");
    }
    public Triangle(double x,double y){
        super(x);
        System.out.println("Parameterized");
        this.y=y;
    }
    public void setY(double y){this.y=y;}
    public double getY(){return y;}
    public double getArea(){return 0.5*x*y;}

}
