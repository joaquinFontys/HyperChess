package hyperchess.ui;

import hyperchess.logic.ChessBoard;
import hyperchess.logic.GameManager;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessMode {
    private GameManager gm = new GameManager(10,10);
    @FXML
    private Label welcomeText;

    @FXML
    private GridPane chessBoard;

    @FXML
    protected void onHelloButtonClick() {
        Color[] colors = {Color.WHITE, Color.BLACK};
        int size = 8;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int nextColor = (row + col) % 2;

                Rectangle rec = new Rectangle();
                rec.setWidth(50);
                rec.setHeight(50);
                rec.setFill(colors[nextColor]);

                chessBoard.setRowIndex(rec, row);
                chessBoard.setColumnIndex(rec, col);
                chessBoard.getChildren().addAll(rec);
            }
        }
        chessBoard.setMaxSize(500,500);
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}