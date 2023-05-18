module view {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens view to javafx.fxml;
    exports view;
}
