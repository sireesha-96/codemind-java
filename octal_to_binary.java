import java.util.Scanner;

 class OctalToBinary2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		String octalString = sc.nextLine();
	
		int decimalVal = Integer.parseInt(octalString, 8);
		String binaryVal = Integer.toBinaryString(decimalVal);
		
		System.out.println( binaryVal);
	}
}