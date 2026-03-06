package loop;

public class DoWhile2 {
    static void main(String[] args) {
        int i = 10;

        //최초 한번은 코드 블럭을 꼭 실행
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }
}
