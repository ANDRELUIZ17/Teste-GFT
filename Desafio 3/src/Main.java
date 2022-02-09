import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] alfabeto = new String[26];
        for (int i = 0; i < alfabeto.length; i++) {
            alfabeto[i] = String.valueOf((char)(i + 97));
        }

        System.out.println("Letra: " + alfabeto[10]); // imprime a letra



    }
}
