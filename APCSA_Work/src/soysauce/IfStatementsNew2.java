package soysauce;
public class IfStatementsNew2 {
	
	double TaxRatePercentage;
	
	
	public double IncomeTax(double Income) {
		if(Income < 0) {
			double TaxRatePercentage = 0.0;
			System.out.println(TaxRatePercentage);
		}
		else if(Income <= 10275) {
			double TaxRatePercentage = 10;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 10276) {
			double TaxRatePercentage = 12;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 41776) {
			double TaxRatePercentage = 22;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 89076) {
			double TaxRatePercentage = 24;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 170051) {
			double TaxRatePercentage = 32;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 215951) {
			double TaxRatePercentage = 35;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 539901) {
			double TaxRatePercentage = 37;
			System.out.println(TaxRatePercentage);
		}
		return TaxRatePercentage;
	}
	
	
	public static void main(String[] args) {
		IfStatementsNew2 obj = new IfStatementsNew2();
		obj.IncomeTax(10000);
		obj.IncomeTax(20000);
		obj.IncomeTax(100000);
		
	}


}
