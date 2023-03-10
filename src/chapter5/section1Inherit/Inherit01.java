package chapter5.section1Inherit;

import java.util.Date;

public class Inherit01 {
  public static void main(String[] args) {
    Circle c = new Circle("yellow", false, new Date(), 1.1);
    System.out.println(c);
  }
}



class SimpleGeometricObject{
  private String color;
  private boolean filled;
  private Date dateCreated;

  public SimpleGeometricObject(){
    dateCreated = new Date();
  }

  public SimpleGeometricObject(String color, boolean filled, Date dateCrDate){
    this.color = color;
    this.filled = filled;
    this.dateCreated = dateCrDate;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public boolean getFilled(boolean filled) {
    return filled;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public String toString(){
    return "created on " + dateCreated
          +" color: " + color
          +" filled: " + filled;
  }
}


class Circle extends SimpleGeometricObject{
  private double radius;

  public Circle(){

  }

  public Circle(String color, boolean filled, Date dateCDate, double radius){
    this.radius = radius;
    setColor(color);
    setDateCreated(dateCDate);
    setFilled(filled);
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}