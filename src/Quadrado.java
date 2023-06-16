public class Quadrado extends Quadrilatero {
       public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    public double perimetro() {
        return super.perimetro();
    }

    public double area() {
     return esquerda*baixo;
    }
  public String toString(){
    return "Lado: "+ esquerda;
  }
}
