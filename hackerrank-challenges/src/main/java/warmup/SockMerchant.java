package warmup;

import java.util.Arrays;

public class SockMerchant {

    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Arrays.sort(ar);
        if (n % 2 != 0) n = n - 1;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                ++pairs;
                i++;
            }
        }
        return pairs;
    }

}
