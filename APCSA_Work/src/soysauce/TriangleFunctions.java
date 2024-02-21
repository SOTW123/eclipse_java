package soysauce;
public class TriangleFunctions {
    double height;
    double base;
    double hypotenuse;
    double sin;
    double cosx; 
    double tanx;


    TriangleFunctions(double ht, double bs) {
    	height = ht;
    	base = bs;
    	Hypotenuse(ht,bs);
    }
    
    private double Hypotenuse(double ht, double bs) {
    	height = ht;
    	base = bs; 
    	hypotenuse = Math.sqrt((height * height)+(base * base));
    	return hypotenuse;
    }
    public double sin(double ht) {
    	height = ht;
    	sin = height / hypotenuse;
    	return sin;
    }
    public double cos(double bs) {
    	base = bs;
    	cosx = base / hypotenuse;
    	return cosx;
    }
    public double tan(double height, double base) {
    	tanx = height / base;
    	return tanx;
    }
    
    public static void main(String[] args) {
    	TriangleFunctions SinCosTan = new TriangleFunctions(4, 3);
    	System.out.println(SinCosTan.Hypotenuse(4,3));
    	System.out.println(SinCosTan.sin(4));
    	System.out.println(SinCosTan.cos(3));
    	System.out.println(SinCosTan.tan(4,3));
        
        
        
        
    }
    
    
}