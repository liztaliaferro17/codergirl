import java.util.Scanner;
import static java.lang.System.out;

public class MultiplicationTable3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int MultiplicationTable;
        int Counter;
        int Total;

        System.out.println("What multiplication Table would you like to see?");
        MultiplicationTable = keyboard.nextInt();
        System.out.println("How large would you like to see them?");
        Counter = keyboard.nextInt();

        for (int i = 0; i <= Counter; i++) {
            Total = MultiplicationTable * i;
            System.out.println(MultiplicationTable + "*" + i + " =" + Total);

        }


    }
}
