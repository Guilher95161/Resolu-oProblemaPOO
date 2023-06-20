import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador, op;
        String opcao;
        double altura, largura;
        System.out.println("Digite quantas formas geometricas irá querer:");
        contador = sc.nextInt();
        ArrayList<FormaGeometrica> formas = new ArrayList<>(contador);
        do {
            System.out.println("\n"+"------Opções------");
            System.out.println("1. Criar Quadrado");
            System.out.println("2. Criar Retangulo");
            System.out.println("3. Criar Circulo");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\n"+"Digite o lado do quadrado");
                    altura = sc.nextDouble();
                    formas.add(new Quadrado(altura));
                    contador--;
                    break;
                case 2:
                    System.out.println("\n"+"Digite a altura do retangulo");
                    altura = sc.nextDouble();
                    System.out.println("Agora a largura");
                    largura = sc.nextDouble();
                    formas.add(new Retangulo(altura, largura));
                    contador--;
                    break;
                case 3:
                    System.out.println("\n"+"Digite o raio do circulo");
                    altura = sc.nextDouble();
                    formas.add(new Circulo(altura));
                    contador--;
                    break;
            }
        } while (contador != 0);
        do{
            System.out.println("\n"+"-----Opções-----");
            System.out.println("a. Imprimir o Array");
            System.out.println("b. Mostrar os perimetros");
            System.out.println("c. Mostrar as Areas");
            System.out.println("d. Sair do programa");
            opcao= sc.next();
            switch(opcao){
case "a":
Iterator <FormaGeometrica> it= formas.iterator();
while(it.hasNext()){
    FormaGeometrica formaAtual= it.next();
    if(formaAtual instanceof Circulo){
        System.out.print("Circulo: ");
        System.out.println(formaAtual.toString());
    }
    if(formaAtual instanceof Quadrilatero){
    if(formaAtual instanceof Quadrado){
        System.out.print("Quadrado: ");
        System.out.println(formaAtual.toString());
    }
    else{
        System.out.print("Retangulo: ");
        System.out.println(formaAtual.toString());
    }
    }
}
break;
case "b":
                System.out.println("\n");
for(FormaGeometrica formaAtual: formas){;
    System.out.println("Perimetro: "+ formaAtual.perimetro());
}
break;
case "c":
                System.out.println("\n");
for(FormaGeometrica formaAtual: formas){
    System.out.println("Area: "+ formaAtual.area());
}
break;
default:
System.out.println("Opção errada");
break;
case "d":
              opcao="d";  
break;
            }
        }while(opcao!="d");
    }
}
