import java.util.Scanner;

public class ConversaoDeTempo_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timeInSecconds = sc.nextInt();
        int hours = timeInSecconds / 3600;
        int minutes = (timeInSecconds % 3600) / 60;
        int seconds = (timeInSecconds % 3600) % 60;
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
