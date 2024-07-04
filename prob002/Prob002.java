package prob002;

public class Prob002 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        //An = An-1 + An-2; n>=3
        //a1 = 1, a2 = 1
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3; i<arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        for(int a : arr) {
            System.out.println(a);
        }
		long a1 = 1, a2 = 1;
		long tmp;
		System.out.print(a1 + " " + a2 + " ");
		for (int i = 0; i < 50; i++) {
			tmp = a2;
			a2 += a1;
			a1 = tmp;
			System.out.print(a2 + " ");
		}
	}
}
