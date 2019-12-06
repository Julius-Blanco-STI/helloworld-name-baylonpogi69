
package lab1;
import java.util.*;
public class Lab1 {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD!");
        Scanner scn = new Scanner (System.in);
        
        System.out.println("What's your name?");
        String name = scn.nextLine();
        
        System.out.println("How Old are you?");
        int z = scn.nextInt();
        
        System.out.println("What's your address");
        String address = scn.nextLine();
        address = scn.nextLine();
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Hi "+name);
        System.out.println("You are "+ z);
        System.out.println("You live at "+ address);
        
        
        
        
    }
    
}
