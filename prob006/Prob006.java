package prob005;

import java.util.Scanner;

class JeongSeung06 {

    public int gcd(int n, int m) {

        int res = 1;
        while(true) {
            int min = Math.min(n, m);
            if(min == 1) return res;
            if(min >= 2) {
                for(int i=2; i<=min; i++) {
                    if(n%i==0 && m%i==0) {
                        n/=i;
                        m/=i;
                        res*=i;
                        break;
                    }
                    if(i==min) {
                        return res;
                    }
                }
            }
        }
    }
}


public class Prob006 {
    public static void main(String[] args) {
    	//정승우
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        JeongSeung06 jeongSeung06 = new JeongSeung06();
//        System.out.println(jeongSeung06.gcd(n, m));
    }
}