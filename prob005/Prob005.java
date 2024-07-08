package prob005;

import java.util.Scanner;

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
    }
}