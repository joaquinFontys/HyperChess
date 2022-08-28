package hyperchess.ui;

import hyperchess.logic.ChessBoard;
import hyperchess.logic.GameManager;
import hyperchess.logic.Tile;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessMode {
    private GameManager gm = new GameManager(8,8);
    @FXML
    private Label welcomeText;

    @FXML
    private GridPane chessBoard;

    @FXML
    protected void onHelloButtonClick() {
        int size = 8;
        int row = 0;
        int col = 0;
        for (Tile tile : gm.getBoard().getTiles()){
            chessBoard.add(tile, row, col);
            if (row == 7){
                row = 0;
                col++;
            } else {
                row++;
            }
        }

//        char rowCord = 'a';
//        int columnCord = 1;
//
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                // color is decided on if the combo of row and col is even or odd
//                int nextColor = (row + col) % 2;
//                String coordinate = "" + rowCord + columnCord;
//                Tile rec = new Tile(coordinate, colors[nextColor]);
//                chessBoard.add(rec, row, col);
//            }
//        }


//        Pane root = new Pane();
//        root.setPrefSize(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
//        root.getChildren().addAll(tileGroup, pieceGroup);
//
//        for (int y = 0; y < HEIGHT; y++) {
//            for (int x = 0; x < WIDTH; x++) {
//                Tile tile = new Tile((x + y) % 2 == 0, x, y);
//                board[x][y] = tile;
//
//                tileGroup.getChildren().add(tile);
//
//                Piece piece = null;
//
//                if (y <= 2 && (x + y) % 2 != 0) {
//                    piece = makePiece(PieceType.RED, x, y);
//                }
//
//                if (y >= 5 && (x + y) % 2 != 0) {
//                    piece = makePiece(PieceType.WHITE, x, y);
//                }
//
//                if (piece != null) {
//                    tile.setPiece(piece);
//                    pieceGroup.getChildren().add(piece);
//                }
//            }
//        }
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}