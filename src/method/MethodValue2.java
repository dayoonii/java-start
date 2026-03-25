package method;

public class MethodValue2 {
    static void main(String[] args) {
        int nubmer = 5;
        System.out.println("1. changeNumber 호출 전, nubmer: " + nubmer);
        changeNumber(nubmer);
        System.out.println("4. changeNumber 호출 후, nubmer: " + nubmer);
    }

    public static void changeNumber(int nubmer) {
        System.out.println("2. changeNumber 변경 전, nubmer: " + nubmer);
        nubmer = nubmer * 2;

        System.out.println("3. changeNumber 변경 후, nubmer: " + nubmer);
    }
}

