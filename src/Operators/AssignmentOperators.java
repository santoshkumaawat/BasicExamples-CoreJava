package Operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 11;
        System.out.println("Assignment x = " + x);

        addAndAssignment(x);
        subtractAndAssignment(x);
        multiplyAndAssignment(x);
        divideAndAssignment(x);
        modulusAndAssignment(x);
        leftShiftAndAssignment(x);
        rightShiftAndAssignment(x);
        bitwiseAndAssignment(x);
        bitwiseExclusiveOrAndAssignment(x);
        bitwiseInclusiveOrAndAssignment(x);
    }

    private static void addAndAssignment(int x) {
        x += 5;
        System.out.println("Add And Assignment : " + x);
    }

    private static void subtractAndAssignment(int x) {
        x -= 5;
        System.out.println("Subtract And Assignment : " + x);
    }

    private static void multiplyAndAssignment(int x) {
        x *= 5;
        System.out.println("Multiply And Assignment : " + x);
    }

    private static void divideAndAssignment(double x) {
        x /= 5;
        System.out.println("Divide And Assignment : " + x);
    }

    private static void modulusAndAssignment(int x) {
        x %= 5;
        System.out.println("Modulus And Assignment : " + x);
    }

    private static void leftShiftAndAssignment(int x) {
        x <<= 5;
        System.out.println("Left Shift And Assignment : " + x);
    }

    private static void rightShiftAndAssignment(int x) {
        x >>= 5;
        System.out.println("Right Shift And Assignment : " + x);
    }

    private static void bitwiseAndAssignment(int x) {
        x &= 5;
        System.out.println("Bitwise And Assignment : " + x);
    }

    private static void bitwiseExclusiveOrAndAssignment(int x) {
        x ^= 5;
        System.out.println("Bitwise Exclusive OR And Assignment : " + x);
    }

    private static void bitwiseInclusiveOrAndAssignment(int x) {
        x |= 5;
        System.out.println("Bitwise Inclusive OR And Assignment : " + x);
    }

}
