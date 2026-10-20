class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();


        for(int i=0; i<tokens.length; i++)
        {
            String token = tokens[i];
if(!(token.equals("+"))&&
!(token.equals("-"))&&
!(token.equals("*"))&&
!(token.equals("/")))
{
    stack.push(Integer.parseInt(token));
}
else
{
    int od2 = stack.pop();
    int od1 = stack.pop();
int r=0;;


            
            switch(token)
            {
                case "+": 
                r=od1+od2;
                break;
                case "-":
                 r=od1-od2;
                 break;
                 case "*":
                 r=od1*od2;
                 break;
                 case "/":
                 r=od1/od2;
                 break;

                 default:
                 break;
            }
            stack.push(r);
            }
        }
           
            return stack.peek();
        }
        
    }
   

