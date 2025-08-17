public class Interface {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.moves();
    }
}

// What is happening here?

// ChessPlayer is declared as an interface.

// An interface in Java is like a contract that says:
//  "Whoever implements me must provide definitions for all the methods I declare."
interface ChessPlayer{
     void moves();
}

class Queen implements ChessPlayer{
    public void moves(){//recreate with function implementation
        System.out.println("up,down,left,right,diagnol(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){//recreate with function implementation
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){//recreate with function implementation
        System.out.println("up,down,left,right,diagnol(by 1 step)");
    }
}

