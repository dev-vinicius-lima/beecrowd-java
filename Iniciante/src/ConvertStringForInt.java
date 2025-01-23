import java.util.Arrays;
import java.util.Scanner;

class ConvertStringForInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] splitString = input.split("");
        int[] result = new int[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            result[i] = Integer.parseInt(splitString[i]);
        }

        System.out.print(Arrays.toString(result));
    }
}
