package com.demo;

public class EnumerationDemo {

	public static void main(String[] args) {
		PaymentType pt = PaymentType.CreditCard;
		System.out.println(pt);
		
		PaymentType[] values = PaymentType.values();
		for(PaymentType payt : values) {
			System.out.println("----------------");
			System.out.println(payt);
			System.out.println(payt.ordinal());
			System.out.println(payt.getFee());
		}
	}
	
	//enum is a collection of constants
	 enum PaymentType {
		 DebitCard(10),
		 CreditCard(25),
		 Cash(15);
		 
		 int fee;
		 PaymentType(int fee){
			 this.fee=fee;
		 }
		 
		 public int getFee() {
			 return fee;
		 }
	 }
}

/*each constant in an enum is internally a class as shown below
class PaymentT {
	static final PaymentT DebitCard = new PaymentT();
}
*/
