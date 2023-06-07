public class Square extends  Shape{
    public Square(){
        System.out.println("Empty");
    }
    public Square(double x){
        super(x);
        System.out.println("Parameterized Square");
    }

    public double getArea() {
    return getX()*getX();
    }

    public void showDetails(){
        System.out.println("X:"+getX());
        System.out.println("Area:"+this.getArea());
    }

}
