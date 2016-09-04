/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author ADMIN
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first = 0;
        int second = 1,next;
        for(int i=0;i<=10;i++){
            if(i<=1){
                next=i;
            }else{
                next = first + second;
                first = second;
                second = next;
            }
           System.out.print(next+" ");
        }
        System.out.println();
                
    }
    
}
