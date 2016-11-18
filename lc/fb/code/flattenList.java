/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, 
 *         rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, 
 *         if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, 
 *         if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    
    Stack<NestedInteger> stack  = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } 
        
        NestedInteger cur = stack.peek();
        
        if (cur.isInteger()) {
            return true;
        } else {
            stack.pop();
            
            List<NestedInteger> list = cur.getList();
            Stack<NestedInteger> subStack = new Stack<>();
            int count = 0;
            
            if (list.size() == 0) {
                return hasNext();
            }
            
            for (int j = 0; j < list.size(); j++) {
                subStack.push(list.get(j));
            }
            
            while (!subStack.isEmpty()) {
                NestedInteger tail = subStack.pop();
                
                if (tail.isInteger()) {
                    count++;
                    stack.push(tail);
                } else {
                    if (tail.getList().size() == 0) {
                        continue;
                    }
                    
                    List<NestedInteger> tempList = tail.getList();
                    for (int k = 0; k < tempList.size(); k++) {
                        subStack.push(tempList.get(k));
                    }
                }
                
            }
            
            if (count > 0) {
                return true;
            } else {
                return hasNext();
            }
            
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */