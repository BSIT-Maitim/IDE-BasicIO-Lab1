package mymain;
import java.util.Scanner;

public class MyMain {
 
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        int currentYear = 2025;
        int yearAtSixty = currentYear + (60 - age);
        
        System.out.println("Hello " + name +  "," + " you are " + age + " years old!");
        System.out.println("You will turn 60 years old in " + yearAtSixty + ".");
        
        
        
        
        

    }
    
}
