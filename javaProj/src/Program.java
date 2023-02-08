
import java.util.Scanner;




public class Program {

    public static void main(String[] args){
        Input user_input = new Input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operator ( +, -, *, /)");
        user_input.setOperator(input.next().charAt(0));
        System.out.println("Enter the 2 numbers one at a time");
        user_input.setNum1(input.nextDouble());
        user_input.setNum2(input.nextDouble());
        input.close();
        compute(user_input);
    }

    public static void compute(Input user_input){
        switch(user_input.operator){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", user_input.num1, user_input.num2, (user_input.num1+user_input.num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", user_input.num1, user_input.num2, (user_input.num1-user_input.num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", user_input.num1, user_input.num2, (user_input.num1*user_input.num2));
                break;
            case '/':
                if (user_input.num2 == 0){
                    System.out.println("Cannot Divide by Zero");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f", user_input.num1, user_input.num2, (user_input.num1/user_input.num2));
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    public static class Input {

        private char operator;
        private double num1;
        private double num2;

        public Input(){
            this.operator = '?';
            this.num1 = 0;
            this.num2 = 0;
        }

        public void setOperator(char operator) {
            this.operator = operator;
        }

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }
    }
}