import java.text.DecimalFormat;
import java.util.*;

public class Main {
    static int countOfAngeles;
    static ArrayList<Integer> coordinates = new ArrayList<>();

    static void input(){
        Scanner input = new Scanner(System.in);
        countOfAngeles = input.nextInt();
        for(int i = 0; i < countOfAngeles*2; i++){
            coordinates.add(input.nextInt());
        }
    }

    static double middleCoordinateXOfShape(){
        double X = 0;
        for(int i = 0; i < countOfAngeles*2; i+=2){
            X += coordinates.get(i);
        }
        X/=countOfAngeles;
        return X;
    }

    public static void main(String[] args){
        input();
        double resultX = middleCoordinateXOfShape();
        DecimalFormat dec = new DecimalFormat("#0.000000000");
        System.out.print(dec.format(resultX));
    }
}
