package ADF1;

import java.time.LocalDate;
import java.util.Date;

public class Geometricaoabject {
    public String color;
    public boolean filled;
    public java.util.Date dateCreated;

    protected Geometricaoabject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return toString();
    }

    public  double getArea(){

        return getArea();
    }
    public double getPerimeter(){

        return getPerimeter();
    }

    public Date getDateCreated() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Ngay Tao: "+localDate);
        return dateCreated;
    }
}
