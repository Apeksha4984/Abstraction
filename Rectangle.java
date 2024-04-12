

package com.mycompany.abstraction;

    public class Rectangle extends Shape {
    double width;
    double height;

   public  Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
   public double calculateArea() {
        return width * height;
    
}
     }