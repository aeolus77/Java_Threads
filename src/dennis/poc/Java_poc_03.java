/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis.poc;

import java.lang.Math.*;

/**
 *
 * @author dennis
 */
public class Java_poc_03 {

    public static void main(String[] argv) {
        final long N = 50000000001L;
        long sum = 0; 
        for(long i = 1; i < N; i++) if(java.lang.Math.pow(java.lang.Math.random(), 2.0) + java.lang.Math.pow(java.lang.Math.random(), 2.0) < 1) {
            sum++;
        }
        System.out.printf("PI = %f%n", 4.0 * sum / (N - 1));  
    }
}
