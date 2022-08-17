module com.example.hyperchess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.hyperchess to javafx.fxml;
    exports com.example.hyperchess;
}