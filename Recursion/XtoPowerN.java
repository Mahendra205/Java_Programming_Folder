public class XtoPowerN {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=pow(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    //optimized process(advance)
    public static int optimizedPow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow=optimizedPow(x, n/2);
        int halfPowSq=halfPow*halfPow;

        // if nis odd
        if(n%2 !=0){
            halfPowSq=x*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.err.println(optimizedPow(2, 5));
    }
}
