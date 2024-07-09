package Prob007;

import java.util.Scanner;

class JeongSeung007 {

    public String isPrime(int n) {

        if(n==1) {
            return "1은 소수가 아닙니다";
        }
        if(n>=2) {
            for(int i=2; i<Math.sqrt(n); i++) {
                if(n%i==0) {
                    return n + "은 소수가 아닙니다";
                }
            }
        }
        return n +"은 소수입니다.";

    }
}


public class Prob007 {
    public static void main(String[] args) {
    	//정승우
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        JeongSeung07 jeongSeung07 = new JeongSeung07();
//        System.out.println(jeongSeung07.isPrime(n));
    }
}
