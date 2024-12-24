import java.util.Scanner;

public class Cedulas_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < notas.length; i++) {
            int qtd = n / notas[i];
            n = n % notas[i];
            System.out.println(qtd + " nota(s) de R$ " + notas[i] + ",00");
        }
    }
}
