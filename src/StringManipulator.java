import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        System.out.println("Wat is je naam? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        name = name.trim();

        int space = name.indexOf(" ");
        int lenght = name.length();

        String first = name.substring(0, space);
        String last = name.substring(space);

        System.out.println(first + last.toUpperCase());

    }

}

