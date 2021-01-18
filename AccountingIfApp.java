
public class AccountingIfApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		
		double divident1;
		double divident2;
		double divident3;
		
		if(income > 10000.0) {
			divident1 = income * 0.5;
			divident2 = income * 0.3;
			divident3 = income * 0.2;
		} else {
			divident1 = income * 1;
			divident2 = income * 0;
			divident3 = income * 0;
		}
				
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Divident1 : " + divident1);
		System.out.println("Divident2 : " + divident2);
		System.out.println("Divident3 : " + divident3);
		
	}

}
