package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * program to calculate sum of Array elements
 * sample input
 * <p>
 * input size: 6
 * input array: 1 2 3 4 5 6
 * expected output: 21
 * </p>
 */
public class SumOfArrayElements {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long sum = getArraySum(arr);
        System.out.println(sum);
    }

    /**
     * method to compute sum of array elements
     *
     * @param arr array for which we need to sum all its elements
     * @return sum of all the array elements
     */
    private static long getArraySum(int[] arr) {
        long sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}