
public class Interface {
    public static void main(String[] args) {
        Queen n=new Queen();
        n.moves();
    }
}
interface ChessPlayer{
    void moves();
} 
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("write,left,up,down,diagonal");
    }

}
class King implements  ChessPlayer{
    public void moves(){
        System.out.println("w,l,u,d,");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("diagonal");
    }
}