package String;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class program1 {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String name = "Soham";
        String lastName = "Pachkatte";
        String fullname = name + " " + lastName;
        System.out.println("concate (name + lastname) : ");
        System.out.println(fullname);

        System.out.println(fullname.charAt(0));
        System.out.println(fullname.charAt(1));

        printLetter(fullname);

    }

}
