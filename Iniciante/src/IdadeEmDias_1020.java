import java.util.Scanner;

public class IdadeEmDias_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years = days / 365;
        int months = (days % 365) / 30;
        days = (days % 365) % 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
    }
}
