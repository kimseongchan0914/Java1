package sec009;

class Chess {
    enum ChessPlayer {
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer() {return ChessPlayer.WHITE;}
}

class WorldChess extends Chess {

}

public class finalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
