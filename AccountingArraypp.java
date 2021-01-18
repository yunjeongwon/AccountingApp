
public class AccountingArraypp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		

		double[] dividentRates = new double[3];
		dividentRates[0] = 0.5;
		dividentRates[1] = 0.3;
		dividentRates[2] = 0.2;
		
		double divident1 = income * dividentRates[0];
		double divident2 = income * dividentRates[1];
		double divident3 = income * dividentRates[2];		
				
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		int i = 0;
		while(i < dividentRates.length) {
			System.out.println("Divident" + i + " : " + income * dividentRates[i]);
			i = i + 1;	
		}		
		
	}

}
