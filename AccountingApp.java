
public class AccountingApp {

	public static void main(String[] args) {

		System.out.println("Value of supply : " + 10000.0);
		System.out.println("Vat : " + 10000.0 * 0.1);
		System.out.println("Expense : " + 10000.0 * 0.3);
		System.out.println("Income : " + (10000.0 - 10000.0 * 0.3));
		System.out.println("Divident1 : " + (10000.0 - 10000.0 * 0.3) * 0.5);
		System.out.println("Divident2 : " + (10000.0 - 10000.0 * 0.3) * 0.3);
		System.out.println("Divident3 : " + (10000.0 - 10000.0 * 0.3) * 0.2);
		
	}

}
