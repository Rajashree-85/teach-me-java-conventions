package powerpackage;

import java.util.Scanner;
public class powerFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=powerFinderOfNumber(num1,num2);
        System.out.println(ans);
    }
    public static int powerFinderOfNumber(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++)
            p *= xyz;
        return p;
    }
}
