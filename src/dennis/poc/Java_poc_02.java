/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis.poc;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author dennis
 */
public class Java_poc_02 {

    public static void main(String[] argv) {
        System.out.println("Hello World\nInput sth here: ");
        Scanner scanner = new Scanner(System.in);
        Java_poc_02 driver = new Java_poc_02();
        String usr_input = scanner.nextLine();
        driver.parse_input(usr_input);
        System.out.println("user input: " + usr_input);
    }

    public void parse_input(String userInput) {
        StringTokenizer tokenizer = new StringTokenizer(userInput, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim());
        }
    }
}
