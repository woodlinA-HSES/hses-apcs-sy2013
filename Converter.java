public class Converter {
  private double factor;
  public Converter(double aConversionFactor) {
    factor = aConversionFactor;
  }
  public double convertTo (double fromMeasurement) {
   return (factor * fromMeasurement); 
  }
  public double convertFrom (double toMeasurement) {
   return (factor / toMeasurement); 
  }
  public static void main(String[] args) {
    final double MILES_TO_METERS = 1609.34;
    final double METERS_TO_MILES = 0.000621371;
    Converter c = new Converter(MILES_TO_METERS);
    System.out.println("Miles To Meters : " + c.convertTo(10.0) + " meters");
    System.out.println("Expected : 16093.4 meters ");
    System.out.println("Meters To Miles : " + c.convertFrom(MILES_TO_METERS) + " miles");
    System.out.println("Expected : 1.0 miles");
  }
}