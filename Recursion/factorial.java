public class factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        // int fnm =fact(n-1);
        // int fn=n*fnm;
        // return fn;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
         
        System.out.println(fact(6));
    }
}
