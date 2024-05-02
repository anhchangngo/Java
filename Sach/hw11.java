import java.util.Scanner;

public class hw11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of integer numbers : ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Try to input again (n > 0): ");
        }

        int[] num = new int[n];
        for(int i = 0; i < n; i ++) {
            System.out.print("Input the number " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }

        // Check number that occurs most frequently
        int count_max = 0;
        int number_fre = 0; // number that occurs most frequently
        for(int m = 0; m < n; m ++) {
            int cnt = 0;
            for(int k = 0; k < n; k ++) {
                if (num[m] == num[k]) {
                    cnt ++;
                }
            }
            if (cnt > count_max) {
                count_max = cnt;
                number_fre = num[m];
            }
        }
        System.out.println("The number that occurs most frequently : " + number_fre + " and it occurs : " + count_max);

        sc.close();
    }
}
