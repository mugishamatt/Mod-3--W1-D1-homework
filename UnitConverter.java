import java.util.Scanner;

public class UnitConverter {
	public static  void conversion(double inch) {
		double meter=0.0254;
		double result=inch*meter;
		System.out.println(result);
		
}

	public static void main(String[] args) {
		
	System.out.println("how many inch to convert?");
		Scanner  convert= new Scanner(System.in) ;
		
		double inch=convert.nextDouble();
		conversion(inch);
	
}
}
