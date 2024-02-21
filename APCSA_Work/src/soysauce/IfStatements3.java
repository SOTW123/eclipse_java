package soysauce;
public class IfStatements3 {
	
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
		else if(Income >= 10276 && Income <= 41775) {
			double TaxRatePercentage = 12;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 41776 && Income <= 89075) {
			double TaxRatePercentage = 22;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 89076 && Income <= 170050) {
			double TaxRatePercentage = 24;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 170051 && Income <= 215950) {
			double TaxRatePercentage = 32;
			System.out.println(TaxRatePercentage);
		}
		else if(Income >= 215951 && Income <= 539900) {
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
		IfStatements3 obj = new IfStatements3();
		obj.IncomeTax(10000);
		obj.IncomeTax(20000);
		obj.IncomeTax(100000);
	}


}
