daily/prob_3/ty
package prob003;

import java.util.Arrays;
import java.util.Scanner;

public class Prob003 {
    public static void main(String[] args) {
//         김태연
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];
//         for(int i = 0; i < 10; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] cnt = new int[10];

//         for(int i = 0; i < 10; i++) {
//             cnt[arr[i]] += 1;
//         }

//         int max = Arrays.stream(cnt).max().getAsInt();
//         System.out.println(max);

//       최현주
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 10개를 입력하시오.(중복 허용):");
        int inputNum[] = new int[10];
        for (int i = 0; i < 10; i++) {
            inputNum[i] = sc.nextInt();
        }
        int count[] = new int [10];

        for(int i = 0; i < 10; i++) {
            count[inputNum[i]]++;
        }
        int maxCnt = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] > maxCnt) {
                maxCnt = count[i];
            }
        }

        System.out.print("최빈수는:");
        boolean isFirst = true;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCnt) {
                if(!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(i);
                isFirst = false;
            }
        }
        System.out.println(" cnt:" + maxCnt);

        sc.close();
    }

}

