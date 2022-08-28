package hyperchess.logic;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private List<Tile> board;
    private List<Piece> activePieces;

    public ChessBoard(int width, int height) {
        this.board = new ArrayList<>();
        this.activePieces = new ArrayList<>();
        generate(width, height);
    }

    public void movePiece(String boardLocation, Piece piece){

    }

    private void generate(int boardWith, int boardHeight){
        Color[] colors = {Color.web("#DFBC96"), Color.web("#8C4B2A")};
        int size = (boardWith + boardHeight) / 2;
        char rowCord = 'a';
        int columnCord = 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // color is decided on if the combo of row and col is even or odd
                int nextColor = (row + col) % 2;
                String coordinate = "" + rowCord + columnCord;
                Tile rec = new Tile(coordinate, colors[nextColor]);
                board.add(rec);
                columnCord++;
            }
            rowCord++;
            columnCord = 1;
        }
    }

    public List<Tile> getTiles() {
        return board;
    }

    public List<Piece> getActivePieces() {
        return activePieces;
    }
}
