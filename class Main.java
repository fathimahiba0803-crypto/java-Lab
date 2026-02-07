public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);   // 12
        int part2 = calc.multiply(5, 7);   // 35
        int sum1 = calc.add(part1, part2); // 47
        int result1 = calc.square(sum1);   // 47^2

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);         // 11
        int square1 = calc.square(sum2);   // 121

        int sum3 = calc.add(8, 3);         // 11
        int square2 = calc.square(sum3);   // 121

        int result2 = calc.add(square1, square2);

        // Print results
        System.out.println("Result of Expression 1: " + result1);
        System.out.println("Result of Expression 2: " + result2);
    }
}
