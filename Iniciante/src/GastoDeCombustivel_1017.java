import java.util.Scanner;

public class GastoDeCombustivel_1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        double distanciaPercorrida = tempo * velocidadeMedia;
        double litrosDeGasolinaGastos = distanciaPercorrida / 12.0;
        System.out.printf("%.3f\n", litrosDeGasolinaGastos);
    }
}
