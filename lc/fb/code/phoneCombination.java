/**
 *
 * This problem is to get all possible letter combinations using
 * given digits. Each digit would correspond to several letters.
 *   
 * @author  Suhan Liu 
 * @param   Digits  
 * @return  List of possible letter combinations
 *
 */


public class Solution {
    public List<String> phoneCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }
        
        List<String> result = new ArrayList<String>();
        
        HashMap<Character,List<Character>> map = new HashMap<>();
        map.put('2', Arrays.asList('a','b','c'));
        map.put('3', Arrays.asList('d','e','f'));
        map.put('4', Arrays.asList('g','h','i'));
        map.put('5', Arrays.asList('j','k','l'));
        map.put('6', Arrays.asList('m','n','o'));
        map.put('7', Arrays.asList('p','q','r','s'));
        map.put('8', Arrays.asList('t','u','v'));
        map.put('9', Arrays.asList('w','x','y','z'));
        
        helper(result, map, digits, "", 0);
        
        return result;
    }
    
    public void helper(List<String> result, 
                HashMap<Character, 
                List<Character>> map, 
                String digits, 
                String str, 
                int count) {
        if (count == digits.length()) {
            result.add(str);
            return;
        }
        
        List<Character> combination = new ArrayList<Character>();
        
        if (map.containsKey(digits.charAt(count)))
            combination = map.get(digits.charAt(count));
        
        for (int i = 0; i < combination.size(); i++) {
            helper(result, 
                map, 
                digits, str + combination.get(i), count + 1);
        }
        
    }
}