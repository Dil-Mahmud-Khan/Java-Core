public class Rectangle extends  Shape{
    protected double y;
    public Rectangle(){}
    public Rectangle(double x,double y){
        super(x);
        this.y=y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public double getArea() {
        return x*y;
    }

    @Override
    public void showDetails() {
        System.out.println("X:"+getX());
        System.out.println("Y:"+getY());
        System.out.println("Area:"+getArea());

    }
}
