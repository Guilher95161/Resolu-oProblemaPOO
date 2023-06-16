public class Quadrilatero implements FormaGeometrica {
     protected double esquerda, cima, direita, baixo;

    public Quadrilatero(double esquerda, double cima, double direita, double baixo) {
        this.esquerda = esquerda;
        this.cima = cima;
        this.direita = direita;
        this.baixo = baixo;
    }

    public double perimetro() {
        double pe = esquerda + cima + direita + baixo;
        return pe;
    }

    public double area() {
        return esquerda * cima;
    }
}
