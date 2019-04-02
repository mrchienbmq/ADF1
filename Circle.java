package ADF1;

public class Circle extends Geometricaoabject {
     double radius;



    public Circle() {
        super();
    }


    public double getRadius() {
        return 0;
    }
    @Override
    public  double getArea(){

        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Circle, Created: "
                + getDateCreated() + ", Radius: " + radius;
    }
}
