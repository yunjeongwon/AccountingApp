
public class AccountingVariablePro {

	public static void main(String[] args) {

		double valueOfSupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double dividentRate1 = 0.5;
		double dividentRate2 = 0.3;
		double dividentRate3 = 0.2;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double divident1 = income * dividentRate1;
		double divident2 = income * dividentRate2;
		double divident3 = income * dividentRate3;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Divident1 : " + divident1);
		System.out.println("Divident2 : " + divident2);
		System.out.println("Divident3 : " + divident3);
		
	}

}
