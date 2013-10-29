public class Balloon {
  private double volume;
  public Balloon() {
    volume = 0.0;
  }
  public void addAir(double amount) {
    volume = volume + amount;
  }
  public double getVolume() {
   return volume; 
  }
  public double getSurfaceArea() {
   return Math.PI * 4 * Math.pow(getRadius(), 2); 
  }
  public double getRadius() {
   return Math.pow(((3*volume)/(4*Math.PI)),(1.0/3.0)); 
  }
  public static void main(String[] args) {
    Balloon b = new Balloon(); 
    b.addAir(100);
    System.out.println("Volume : " + b.getVolume());
    System.out.println("Expected : 100 cm^3");
    System.out.println("Surface Area : " + b.getSurfaceArea());
    System.out.println("Expected : ");
    System.out.println("Radius : " + b.getRadius());
    System.out.println("Expected : ");
  }
}