import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("André Luiz");
        funcionario.setSalario(1000.00);
        funcionario.setCPF("123.456.789-10");
        funcionario.setDataAdmissao(2018);
        funcionario.setMatricula(String.valueOf(1));

        System.out.println(funcionario.toString());
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Salario:" + funcionario.getSalario());
        System.out.println("CPF" + funcionario.getCPF());
        System.out.println("Data da Admissão" + funcionario.getDataAdmissao());
        System.out.println("Matricula" + funcionario.getMatricula());
        System.out.println();

        sc.close();

    }
}




