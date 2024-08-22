// public class FirstOccurenceInArray {
//     public static int firstOccurene(int arr[],int key,int i ){
//         if(i== arr.length){
//             return -1;
//         }
        
//         if(arr[i] ==key){
//              return i;
//         }
//         return firstOccurene(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,5,2,7,5};
         
//         System.out.println(firstOccurene(arr, 2,0));
//     }
// }


//print how many time the number occur

public class FirstOccurenceInArray {
    public static void firstOccurene(int arr[],int key,int i ){
        if(i==arr.length){
            return;
        }
           
        
        if(arr[i] ==key){
             System.out.println(i+" ");;
        }
         firstOccurene(arr, key, ++i);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,7,5};
         
        firstOccurene(arr, 2,0);
    }
}


//print last occurence of a number
// public class FirstOccurenceInArray {
//     public static int lastOccurence(int arr[],int key,int i){
//         if(i== 0){
//             return -1;
//         }
//         if(arr[i] ==key){
//             return i;
//         }
//         return lastOccurence(arr, key, i-1);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,5,2,7,5};
//         int i=arr.length-1;
//         System.out.println(lastOccurence(arr, 2,i));
//     }
// }

