class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i =0;i<s.length();i++){
           char a = s.charAt(i);

           if(a =='{' || a == '(' || a == '['){
            stack.push(a);
           }else{
         
            if(stack.isEmpty() ){
               return false;
                
            }

               char x = stack.pop();
            if(( a == '}' && x != '{' ) ||  ( a == ']' && x != '[' ) || ( a == ')' && x != '(' )){
                return false;
            }
           }
           
        }

        return stack.isEmpty();
        
    }
}
