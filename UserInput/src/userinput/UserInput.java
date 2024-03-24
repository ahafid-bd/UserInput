
package userinput;
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String i;
         System.out.print("enter any name : ");
         i = input.next();
        System.out.println("welcome !!"+i+"!!");
        Scanner input2 = new Scanner(System.in);
        String name;
        System.out.print("My name is : " );
        name = input2.nextLine();
        System.out.print("Best of luck : "+name+"\n");
        
        
        
        
    }
    
}
