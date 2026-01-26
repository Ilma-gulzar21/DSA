import java.util.Scanner;
class SubArray {

    static void ArrayPairs(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int totalSubArray = 0;

        System.out.println("All Sub-Arrays:");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                // print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println(" Sum = " + sum);

                // max sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // min sum
                if (sum < minSum) {
                    minSum = sum;
                }

                totalSubArray++;
            }
        }

        System.out.println("Max Sum = " + maxSum);
        System.out.println("Min Sum = " + minSum);
        System.out.println("Total Sub Array = " + totalSubArray);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayPairs(arr);
        sc.close();
    }
}