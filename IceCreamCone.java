public class IceCreamCone {
  private double height;
  private double radius;
  public IceCreamCone(double h, double r) {
    height = h;
    radius = r;
  }
  public double getVolume() {
    return (1.0/3.0) * Math.PI * Math.pow(radius,2) * height; 
  }
  public double getSurfaceArea() {
    double slantHeight = Math.sqrt(Math.pow(height,2) + Math.pow(radius,2));
    return ((Math.PI * Math.pow(radius,2)) + (Math.PI * radius * slantHeight));
  }
  public static void main(String[] args) {
    IceCreamCone i = new IceCreamCone(5.0,10.0);
    System.out.println("Volume : " + i.getVolume());
    System.out.println("Expected : 523.5987755982987 ");
    System.out.println("Surface Area : " + i.getSurfaceArea());
    System.out.println("Expected : ----- ");
  }
}