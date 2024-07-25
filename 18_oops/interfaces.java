public class interfaces{
    public static void main(String args[]){
      Queen q = new Queen();
      q.moves();
    }
}

interface ChessPlayers{
    void moves();
}

class Queen implements ChessPlayers{
    public void moves(){
    System.out.println("up, down, right, left, in all four directions");
    }
}

class Rook implements ChessPlayers{
    public void moves(){
    System.out.println("up, down, right, left");
    }
}

class King implements ChessPlayers{
    public void moves(){
    System.out.println("up, down, right, left, DIAGONAL(BY 1 STEP");
    }
}