package manynum;

import java.util.Scanner;

public class ManyNumber {
    public static void main(String[] args) {
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
