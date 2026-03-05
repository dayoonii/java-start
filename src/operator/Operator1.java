package operator;

public class Operator1 {
    static void main(String[] args) {
        //변수 
        int a = 5;
        int b= 2;
        
        //덧셈 
        int sum = a + b;
        System.out.println("sum = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("diff = " + diff);
        
        //곱셈 
        int multi = a * b;
        System.out.println("multi = " + multi);
        
        //나눈셈 
        int div = a / b; // int형은 소숫점 표현 X 
        System.out.println("div = " + div);
        
        //나머지 
        int mod = a % b; // 몫은 2 나머지 1
        System.out.println("mod = " + mod);

    }
}
