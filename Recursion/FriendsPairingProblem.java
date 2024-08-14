public class FriendsPairingProblem {

    public static int friendsPairing(int n){

        //base case
        if(n==1 || n==2){
            return n;
        }
        //for single
        int fnm1=friendsPairing(n-1);
        //for pair
        int fnm2=friendsPairing(n-2);
        int ways=friendsPairing(n-1)*fnm2;
        //total ways
        int totalWays=fnm1+ways;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
