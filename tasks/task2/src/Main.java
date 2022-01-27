import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pieces = scanner.nextInt();
        int result = (int) Math.ceil(pieces/(double)2);
        System.out.println(result);
    }
}
