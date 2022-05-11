import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        NumberClosestToZero numberClosestToZero = new NumberClosestToZero();
        List<Integer> tempList = new ArrayList<>();

        System.out.println("Specify number of temperatures: ");
        int tempNum = scanner.nextInt();
        for (int i = 0; i < tempNum; i++) {
            tempList.add(randomIntGenerator.getRandomNumber((-50), (50)));
        }
        System.out.println("Generated set of temperatures: "+tempList);
        System.out.println(numberClosestToZero.getNumberClosestToZero(tempList));

    }
}
