import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please type your name");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println("Name: "+name);

        System.out.println("Please type your age");
        String age = scan.nextLine();
        System.out.println("Age: "+age);

        int result = 67 - parseInt(age);;
        System.out.println("You can retire in " +result+ " years");
    }


}