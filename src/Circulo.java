public class Circulo implements FormaGeometrica {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }
  public String toString(){
    return "Raio: "+raio;
  }
}
