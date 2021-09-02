public class Main {
    static class Min_Max {
        int SmallNumber;
        int LargeNumber;
    }

    static Min_Max func1(int arr[], int n) {
        Min_Max minMax = new Min_Max();
        int i;
        if (n == 1) {
            minMax.LargeNumber = arr[0];
            minMax.SmallNumber = arr[0];
            return minMax;
        }

        if (arr[0] > arr[1]) {
            minMax.LargeNumber = arr[0];
            minMax.SmallNumber = arr[1];
        }
        else {
            minMax.LargeNumber = arr[1];
            minMax.SmallNumber = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minMax.LargeNumber) {
                minMax.LargeNumber = arr[i];
            }
            else if (arr[i] < minMax.SmallNumber) {
                minMax.SmallNumber = arr[i];
            }
        }
        return minMax;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int s = 6;
        Min_Max minMax = func1(arr, s);
        System.out.printf("\n MinimumNumber is %d", minMax.SmallNumber);
        System.out.printf("\n MaximumNumber is %d", minMax.LargeNumber);
    }
}