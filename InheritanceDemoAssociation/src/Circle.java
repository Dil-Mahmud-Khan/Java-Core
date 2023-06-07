public class Circle extends Shape{
    public Circle(){
        System.out.println("Empty");
    }
    public Circle(double x){
        super(x);
        System.out.println("Paremeterized");

    }
    public double getArea(){
        return 3.1416*x*x;
    }
    public void showDetails(){
        System.out.println("Radius:"+getX());
        System.out.println("Area:"+this.getArea());
    }

}
