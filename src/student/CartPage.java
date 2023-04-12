package student;

import demo.PaymentPage;

public class CartPage {
	
	LoginPage login= new LoginPage();
	PaymentPage pay= new PaymentPage();
	
	public void addToCartAndPayment() {
		login.userLogin();
		System.out.println("user add product into the cart");
		pay.payment();
		
		
	}
	public static void main(String[] args) {
		
		CartPage cart= new CartPage();
		cart.addToCartAndPayment();
		
	}
	
	

}
