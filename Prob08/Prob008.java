package prob008;

import java.util.Scanner;

class JeongSeung008 {

    public int factorial(int n) {
        if(n == 0) return 0;
        int res = 1;
        for(int i=n; i>0; i--) {
            res*=i;
        }
        return res;
    }
}


public class Prob008 {
    public static void main(String[] args) {
    	//정승우
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        JeongSeung08 jeongSeung08 = new JeongSeung08();
//        System.out.println(jeongSeung08.factorial(n));
    }
}