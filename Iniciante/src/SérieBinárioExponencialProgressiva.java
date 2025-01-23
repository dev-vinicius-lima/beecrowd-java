import java.util.Scanner;

public class SérieBinárioExponencialProgressiva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            StringBuilder sb = new StringBuilder();
            long term = a + b;
            sb.append(term).append(" ");
            for (int j = 1; j < n; j++) {
                term += ((long) Math.pow(2, j)) * b;
                sb.append(term).append(j < n - 1 ? " " : "");
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}

