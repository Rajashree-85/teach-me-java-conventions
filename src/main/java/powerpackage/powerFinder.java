package powerpackage;

public class powerFinder {
    public static void main(String[] args) {
        int num1=2,num2=5;
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
