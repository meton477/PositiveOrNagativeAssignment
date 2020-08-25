import java.util.Scanner;

public class PositiveOrNagotiveAssignment {
    public static void main(String[] arg) {
        String welcomeMessage = "Your number";
        System.out.println(welcomeMessage);

        Scanner scanner = new Scanner(System.in);
        String message ="";
        int number = scanner.nextInt();

                if (number >=0) {
                    if (number==0){
                        message = "Num is 0";
                    }
                    else {
                        message = "positive";
                    }
                }System.out.print(message);
    }
}
