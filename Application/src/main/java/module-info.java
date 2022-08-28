module com.example.hyperchess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens hyperchess.ui to javafx.fxml;
    exports hyperchess.ui;
}