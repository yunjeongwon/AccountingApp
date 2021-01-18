class Accounting{
	
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + getVat());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Divident1 : " + getDivident1());
		System.out.println("Divident2 : " + getDivident2());
		System.out.println("Divident3 : " + getDivident3());
	}

	public double getDivident3() {
		return getIncome() * 0.2;
	}

	public double getDivident2() {
		return getIncome() * 0.3;
	}

	public double getDivident1() {
		return getIncome() * 0.5;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getVat() {
		return valueOfSupply * vatRate;
	}
}
public class AccountingClassApp {

	public static void main(String[] args) {

//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;				
//		Accounting.print();
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
	}	

}
