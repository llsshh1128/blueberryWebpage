public class Solution { 
	public int mySqrt(int x) {
        if (x == 0)
            return 0;
            
        int left = 1, right = x;
        int root = 0;
        
        while (true) {
            root = left + (right - left)/2;
            if (root > x/root) {
                right = root - 1;
            } else {
                if (root + 1 > x/(root + 1))
                    return root;
                    
                left = root + 1;
            }
        }
	}
}