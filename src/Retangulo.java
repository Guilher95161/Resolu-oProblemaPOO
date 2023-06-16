public class Retangulo extends Quadrilatero{
     public Retangulo(double esquerda, double cima) {
        super(esquerda, cima, esquerda, cima);
    }

    public double perimetro() {
        return super.perimetro();
    }

    public double area() {
        return esquerda * cima;
    }
  public String toString(){
    return "Altura: "+ esquerda +"  Largura: "+ cima;
  }
}
