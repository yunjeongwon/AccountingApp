
public class AccountingMethodPro {

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double dividentRate1;
	public static double dividentRate2;
	public static double dividentRate3;

	public static void main(String[] args) {

		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		dividentRate1 = 0.5;
		dividentRate2 = 0.3;
		dividentRate3 = 0.2;
		
		print();
		
	}

	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + getVate());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Divident1 : " + getDivident1());
		System.out.println("Divident2 : " + getDivident2());
		System.out.println("Divident3 : " + getDivident3());
	}

	public static double getDivident3() {
		return getIncome() * dividentRate3;
	}

	public static double getDivident2() {
		return getIncome() * dividentRate2;
	}

	public static double getDivident1() {
		return getIncome() * dividentRate1;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getVate() {
		return valueOfSupply * vatRate;
	}

}
