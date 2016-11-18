public class Solution { 
	public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        if (x == 0) {
            return 0;
        }
        
        int preN = n;
        
        if (n < 0) {
            x = 1./x;
            if (n == Integer.MIN_VALUE)
                n++;
            n = -n;
        }
        
        double result = 0;
        
        if (n % 2 == 0) {
            result = myPow(x * x, n / 2);
        } else {
            result = myPow(x * x, n / 2) * x;
        }
        
        if (preN == Integer.MIN_VALUE) {
            result = result * x;
        }
        
        return result;
	}
}