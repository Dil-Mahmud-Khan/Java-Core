public class Shape {
    protected double x;
    public Shape(){
        System.out.println("Empty Shape");
    }
    public Shape(double x){
        this.x=x;
        System.out.println("Parameterized Shape");
    }

    public void setX(double x){this.x=x;}
    public double getX(){return x;}

    public void showDetails(){
        System.out.println("Not a specific Shape yet");
    }

}
