public class NumToString {
    
    public static void printDigit(String arr[],int num){
        if(num==0){
            return;
        }
        int getDigit=num%10;
        printDigit(arr, num/10);
        System.out.print(arr[getDigit]+" ");
    }
    public static void main(String[] args) {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        printDigit(arr,1234 );   
    }
    
}
