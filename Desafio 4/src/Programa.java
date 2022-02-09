import java.util.Scanner;

public class Programa implements Operacao{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        Operacao op = new Programa();
        System.out.println("Resultado: " + (a + b));
        System.out.println("Resultado: " + (a - b));
        System.out.println("Resultado: " + (a * b));
        System.out.println("Resultado: " + (a / b));

    }

    @Override
    public double calcular(double a, double b) {
        return 0;
    }
}
