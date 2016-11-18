public class Solution { 
	public String intToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        
        int quotient = num;
        int count = 0;
        
        String result = "";
        
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(0,"");
        map.put(1," Thousand");
        map.put(2," Million");
        map.put(3," Billion");
        
        String[] lessThan20 
            = new String[]{"","One","Two", "Three", "Four", "Five", 
                           "Six", "Seven", "Eight", "Nine", "Ten", 
                           "Eleven", "Twelve", "Thirteen", "Fourteen", 
                           "Fifteen", "Sixteen", "Seventeen", 
                           "Eighteen", "Nineteen"};
        String[] tens = new String[]{"","","Twenty","Thirty","Forty",
                                     "Fifty","Sixty","Seventy",
                                     "Eighty","Ninety"};
        
        while (quotient != 0) {
            int residual = quotient % 1000;
            
            if (residual > 0)
                result = getThreeDigits(residual,lessThan20,tens) 
                         + map.get(count) 
                         + result;
            
            quotient = quotient / 1000;
            
            count++;
        }
        
        if (result.charAt(0) == ' ') {
            result = result.substring(1);
        }
        
        if (result.charAt(result.length() - 1) == ' ') {
            result = result.substring(0,result.length() - 1);
        }
        
        
        return result;
    }
    
    private String getThreeDigits(int number, 
    	                         String[] lessThan20, 
    	                         String[] tens) {
        String combination = "";
        
        if (number / 100 > 0) {
            int hundred = number / 100;
            combination = " " + lessThan20[hundred] + " Hundred";
        }
        
        int tenth = number % 100;
        
        if (tenth < 20 && tenth > 0) {
            combination += " " + lessThan20[tenth];
        } else if (tenth >= 20){
            int secondPos = tenth / 10;
            combination += " " + tens[secondPos];
            
            if (tenth % 10 > 0) {
                combination += " " + lessThan20[tenth % 10];
            }
            
        }
        
        return combination;
    }


}