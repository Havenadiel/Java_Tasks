public class Task120 {

    public static int calculateCumulativeSums(int... numbers) {
       
        int totalSum = 0;
        for (int num : numbers) {
            int cumulativeSum = 0;  

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + num + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        int total = calculateCumulativeSums(numbers);
        System.out.println("Total sum of cumulative sums is " + total);
    }
}
