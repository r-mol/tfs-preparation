import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n;i++) {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> increasing = new ArrayList<>();
        Collections.sort(list);
        long result= 0;
        for(int elem: list){
            int maxChange = 0;
            int position = 0;
            while(elem!=0){
                if((9 - elem % 10) * (int)Math.pow(10,position) > 0){
                    maxChange = (9-elem%10) * (int)Math.pow(10,position);
                }
                position++;
                elem/=10;
            }
            increasing.add(maxChange);
        }

        increasing.sort(Collections.reverseOrder());
        for(int i = 0; i <k;i++){
            result+=increasing.get(i);
        }
        System.out.println(result);
    }
}
