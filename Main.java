import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minutes:");
        int minutes = scanner.nextInt();

        Timer timer = new Timer(minutes);

        timer.countSeconds();
    }
}