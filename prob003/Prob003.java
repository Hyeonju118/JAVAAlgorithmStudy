package prob003;

import java.util.Arrays;
import java.util.Scanner;

public class Prob003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int[] cnt = new int[10];

        for(int i = 0; i < 10; i++) {
            cnt[arr[i]] += 1;
        }

        int max = Arrays.stream(cnt).max().getAsInt();
        System.out.println(max);
    }
}