package hyperchess.logic;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class ChessBoard {
    private List<Tile> board;
    private List<Piece> activePieces;

    public ChessBoard(int width, int height) throws FileNotFoundException {
        this.board = new ArrayList<>();
        this.activePieces = new ArrayList<>();
        generate(width, height);
        addPieces();
    }

    public void movePiece(String boardLocation, Piece piece){

    }

    private void generate(int boardWith, int boardHeight){
        Color[] colors = {Color.web("#DFBC96"), Color.web("#8C4B2A")};
        int size = (boardWith + boardHeight) / 2;
        char rowCord = 'a';
        int columnCord = 8;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // color is decided on if the combo of row and col is even or odd
                int nextColor = (row + col) % 2;
                String coordinate = "" + rowCord + columnCord;
                Tile rec = new Tile(coordinate, colors[nextColor]);
                board.add(rec);
                rowCord++;
            }
            columnCord--;
            rowCord = 'a';
        }
    }

    private void addPieces() throws FileNotFoundException {
        List<String> pieces = new ArrayList<>();

        try {
            Files.lines(Path.of("src/main/java/hyperchess/logic/layout/layout.txt")).forEach(piece -> pieces.add(piece));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Layout file not found");
        }

        for (String piece : pieces) {
            String[] pieceData = piece.split(",");
            FileInputStream inputStream = new FileInputStream(pieceData[1]);
            Image image = new Image(inputStream);
            Piece newPiece = new Piece(pieceData[0], pieceData[2], image);
            activePieces.add(newPiece);
        }
        System.out.println(pieces.toString());
    }

    public List<Tile> getTiles() {
        return board;
    }

    public List<Piece> getActivePieces() {
        return activePieces;
    }
}
