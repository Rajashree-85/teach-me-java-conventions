package powerpackage;

public class powerFinder {
    public static void main(String[] args) {
        int num1=2,num2=5;
        int ans=powerFinderOfNumber(num1,num2);
        System.out.println(ans);
    }
    public static int powerFinderOfNumber(int base, int exponent) {
        int ans = 1;
        for (int counter = 0; counter<exponent; counter++)
            ans*=base;
        return ans;
    }
}
