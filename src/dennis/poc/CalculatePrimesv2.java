/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dennis.poc;

/**
 *
 * @author dennis
 */
public class CalculatePrimesv2 extends Thread{
    public static final int MAX_PRIMES = 1000000;
    public static final int TEN_SECONDS = 10000;
    
    private String name;
    
    public CalculatePrimesv2(String name){
        this.name = name;
    }
    
    public volatile boolean finished = false;
    
    public void run(){
        int[] primes = new int[MAX_PRIMES];
        int count = 0;
        
        for (int i=2; count<MAX_PRIMES; i++){
            
            if (finished){
                System.out.println(this.name + " Finding prime: " + primes[count-1]);
                break;
            }
            
            boolean prime = true;
            for(int j=0; j<count; j++){
                if(i%primes[j] ==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                primes[count++] = i;
                System.out.println(this.name + " Found prime: " + i);
            }
        }
    }
    
    public static void main(String[] args){
        CalculatePrimesv2 calculator = new CalculatePrimesv2("Thread 1");
        CalculatePrimesv2 calculator2 = new CalculatePrimesv2("Thread 2");
        calculator.start();
        calculator2.start();
        try{
            Thread.sleep(TEN_SECONDS);
        }
        catch (InterruptedException e){
            //fall through
        }
        
        calculator.finished = true;
        calculator2.finished = true;
    }
}
