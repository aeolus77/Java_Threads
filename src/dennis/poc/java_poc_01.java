/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis.poc;

import java.io.Console;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author dennis
 */
public class java_poc_01 extends JFrame {

    public java_poc_01() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        this.getContentPane().add(fileChooser);
        fileChooser.setVisible(true);
    }

    public static void main(String[] argv) {
//        System.out.println("Hello World\nInput sth here: ");
//        Scanner scanner = new Scanner(System.in);
//
//        String usr_input = scanner.nextLine();
//        System.out.println("user input: " + usr_input);
        JFrame frame = new java_poc_01();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
