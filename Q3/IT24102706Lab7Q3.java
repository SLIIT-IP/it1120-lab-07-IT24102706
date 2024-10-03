import java.util.Scanner;//import the scanner class file from util standard
	public class IT24102706Lab7Q3 {
		public static void main (String[] args) {//function main begins here
		Scanner sc = new Scanner(System.in);//Creating a scanner object
			
		int bill;
		char payment;
	for(int count = 1; count <= 5; count++) {
		System.out.print("Enter total bill amount:");
		bill = sc.nextInt();
		
		double discount = bill*0.05;
		double finalamount;

		System.out.print("Enter mode of payment (C for cash, 0 for other):");
		payment = sc.next().charAt(0);
		
		if (payment == 'C') {
			finalamount = bill - discount;
			System.out.print("discount is :"+discount);
		} else if (payment == 'O' ) {
			finalamount = bill;
			System.out.print( "no discount applicable");
		} else {
			System.out.print("payment mode is not valid");
			continue;	
		}  
			
		
		System.out.print("Amount to be paid"+ finalamount);
	}
    } 
}