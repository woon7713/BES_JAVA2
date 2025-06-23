/**
 * 두 수의 덧셈 기능을 제공하는 계산기 클래스입니다.
 */

public class Calculator {
    /**
     * @deprecated Use {@link #addNumber(int, int)} instead.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return 두 수의 합
     */
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }


    /**
     * 두 수를 더합니다.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return 두 수의 합
     */
    public int addNumber(int a, int b) {
        return a + b;
    }
}