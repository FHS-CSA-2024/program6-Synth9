import java.util.Scanner;
public class Program6{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the radius:\n");
        double radius = userInput.nextDouble();
        System.out.println("\nThe radius of the circle = " + radius + "\n");
        
        double diameter = radius * 2;
        System.out.println("The diameter of the circle = " + diameter + "\n");
        
        final double pi = 3.14159;
        double area = pi * radius * radius;
        area = (int) (area * 1000);
        area = area / 1000;
        System.out.println("The area of the circle = " + area + "\n");
        
        double circumference = 2 * pi * radius;
        circumference = (int) (circumference * 1000);
        circumference = circumference / 1000;
        System.out.println("The circumference of the circle = " + circumference + "\n");
    }
}

//Paste console output below:
/*
Enter the radius:

3.712

The radius of the circle = 3.712

The diameter of the circle = 7.424

The area of the circle = 43.287

The circumference of the circle = 23.323


*/
