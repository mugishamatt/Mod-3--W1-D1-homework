import java.util.Scanner;

public class Multiplyoutput {
 
 public static void main(String[] args) {

Scanner inputnumber = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = inputnumber.nextInt();
   
  System.out.println("Input second number: ");
  int num2 = inputnumber.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
 }
 
}