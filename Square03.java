public class Square03 {
  private double sideLength;
  public Square03(double sideLength02) {
    sideLength = sideLength02;
  }
  public double getPerimeter() {
   double perimeter = (4 * sideLength);
    return perimeter;
  }
  public double getArea() {
    double area = (sideLength * sideLength);
    return area;
  }
  public double getDiagonal() {
   double diagonal = (sideLength * Math.sqrt(2));
   return diagonal;
  }
  public static void main(String[] args) {
  Square03 square01 = new Square03(4);
  System.out.println("Perimeter : " + square01.getPerimeter());
  System.out.println("Expected : 16.0");
  System.out.println("Area : " + square01.getArea());
  System.out.println("Expected : 16.0");
  System.out.println("Diagonal Length : " + square01.getDiagonal());
  System.out.println("Expected : ");
}
}



