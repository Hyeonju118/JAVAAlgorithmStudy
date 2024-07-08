package prob005;

import java.util.Scanner;

class JeongSeung05 {

    void caseTrans(String str) {
        StringBuilder sb = new StringBuilder();
        char c = 0;
        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) < 92) {
                c = (char) (str.charAt(i) + 32);
            } else {
                c = (char) (str.charAt(i) - 32);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}


public class Prob005 {
    public static void main(String[] args) {
        /* ty
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (char c : str.toCharArray()) {
            System.out.print(Character.isUpperCase(c) ?
                    Character.toLowerCase(c) : Character.toUpperCase(c));

        }
         */

         /* hj
          String input = "helloWorLD";
        char []arr;
        arr = input.toCharArray();

        for (int i = 0; i<arr.length; i++ ){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char) (arr[i] + 'A' - 'a');
            }
            else if(arr[i] >= 'A' && arr[i] <='z'){
                arr[i] =(char)(arr[i] -('A'-'a'));

            }
        }
        System.out.print(arr);
          */
    	
    	//정승우
    	/*
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        JeongSeung05 jeongSeung05 = new JeongSeung05();
        jeongSeung05.caseTrans(str);
    	*/

    }
}