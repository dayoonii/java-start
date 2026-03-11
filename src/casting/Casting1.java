package casting;

public class Casting1 {
    static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);

        // 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용 가능 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있다.
        // 자동형변환

    }
}
