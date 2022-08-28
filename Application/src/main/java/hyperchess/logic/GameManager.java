package hyperchess.logic;

public class GameManager {
    private int turnCount;
    private ChessBoard board;
    private Player player1;
    private Player player2;
    private Player current;

    public GameManager(int width, int height) {
        this.board = new ChessBoard(width,height);
        this.player1 = new Player("Joaquin", 0);
        this.player2 = new Player("Sakuya", 0);
        this.current = player1;
    }

    private void swapTurn(){

    }

    private void previewPiece(){

    }
}
