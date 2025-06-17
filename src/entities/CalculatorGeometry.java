package entities;

public class CalculatorGeometry {
    private final Double PI = 3.14159;
    private Double result;
    private Double base, height, width, volume, radius;

    public CalculatorGeometry() {
    }

    public CalculatorGeometry(Double result, Double base, Double height, Double width, Double volume, Double radius) {
        this.result = result;
        this.base = base;
        this.height = height;
        this.width = width;
        this.volume = volume;
        this.radius = radius;
    }
    // métodos

    public double calcAreaTriangle(double width, double height) {
        return width * height / 2.0;
    }

    public double calcAreaSquare(double width, double height) {
        return width * height;
    }

    public double calcAreaTrapeze(double baseA, double baseB, double height) {
        return (baseA + baseB) * height / 2.0;
    }

    public double calcAreaCircle(double radius) {
        return PI * Math.pow(2, radius);
    }
  public double calcAreaRectangle(double width, double height){
        return width * height;
  }

    @Override
    public String toString() {
        return "CalculatorGeometry{" +
                "PI=" + PI +
                ", result=" + result +
                ", base=" + base +
                ", height=" + height +
                ", width=" + width +
                ", volume=" + volume +
                ", radius=" + radius +
                '}';
    }
}
