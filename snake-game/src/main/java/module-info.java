module br.com.game {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.game to javafx.fxml;
    exports br.com.game;
}