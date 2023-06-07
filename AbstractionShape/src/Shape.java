public abstract class Shape {
    protected double x;
    public Shape(){}
    public Shape(double x){
        this.x=x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public abstract double getArea();
    public abstract void showDetails();


}
