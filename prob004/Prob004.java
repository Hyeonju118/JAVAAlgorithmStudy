package prob004;

import java.util.Scanner;

class JeongSeung04 {

    void trans(int n) {
        int cnt = 0;
        int[] arr = new int[100];
        while(n>=1) {

            int d = n % 2;
            arr[cnt] = d;
            n /= 2;
            cnt++;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}


public class Prob004 {
	public static void main(String[] args) {
	/*
	 * ty Scanner sc = new Scanner(System.in); int n = sc.nextInt();
	 * 
	 * // 방법 1. // String bin = Integer.toBinaryString(n); //
	 * System.out.println(bin);
	 * 
	 * // 방법 2. int bin[] = new int[100]; int i = 0; int mok = n; while(mok > 0) {
	 * bin[i] = mok % 2; mok /= 2; i++; } i--; for(; i >= 0; i--) {
	 * System.out.print(bin[i]); }
	 */

	/*
	 * int inputNum = 19; int bin[] = new int[100];
	 * 
	 * int i = 0; int mod = inputNum;
	 * 
	 * while(mod > 0) { bin[i] = mod % 2; mod /= 2; i++; } i--; for(; i>=0; i--){
	 * System.out.print(bin[i]); }
	 */

		/*
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        int cnt = 0;
        int n = sc.nextInt();
        JeongSeung04 jeongSeung04 = new JeongSeung04();
        jeongSeung04.trans(n);
		*/
		
	int binary_scale(int a) {
		if (a == 0)
			return 0;
		String str = "";
		int b;
		while (a > 1) {
			b = a % 2;
			a /= 2;
			str = b + str;
		return Integer.parseInt(1 + str);
	}
	System.out.println(100);
	}
}