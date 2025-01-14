class Solution {

    ArrayList<Integer> findTwoElement(int arr[]) {

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
            actualSumOfSquares += (long) arr[i] * arr[i];
        }

        long sumDifference = expectedSum - actualSum; 
        long squareSumDifference = expectedSumOfSquares - actualSumOfSquares; 
        long sumPlusDifference = squareSumDifference / sumDifference; 

        int missing = (int) (sumDifference + sumPlusDifference) / 2;
        int repeating = (int) (sumPlusDifference - missing);

        result.add(repeating);
        result.add(missing);

        return result;
    }
}
