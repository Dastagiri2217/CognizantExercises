public class OperatorPrecedence {
    public static void main(String[] args) {
        int exp1 = 10 + 5 * 2;
        int exp2 = (10 + 5) * 2;
        int exp3 = 20 / 5 + 2 * 3;
        int exp4 = 100 - 20 / 4 + 3;

        System.out.println("Result of (10 + 5 * 2) = " + exp1);
        //in the expression 1 the * has high OperatorPrecedence so  first 5*2 is 
         //calulated i.e 10 and after + will happen
        System.out.println("Result of ((10 + 5) * 2) = " + exp2);
        //In the expression 2 as we see the () has high precedence 
        //so first in brackets result is calulated and then * will oocur
        System.out.println("Result of (20 / 5 + 2 * 3) = " + exp3);
        // In the expression 3 as we see the * and /  has equal precedence 
        //so it looks for assotivity so from left to right
        //first / happen and then * after +
        System.out.println("Result of (100 - 20 / 4 + 3) = " + exp4);
        //In the expression 4 first OperatorPrecedence / will be calculated anthen assotivity i.e - and +
    }
}
