import java.util.Arrays;
import java.util.Scanner;

class ConvertStringForIntRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] result = input.chars().map(Character::getNumericValue).toArray();
        System.out.print(Arrays.toString(result));
    }
}
