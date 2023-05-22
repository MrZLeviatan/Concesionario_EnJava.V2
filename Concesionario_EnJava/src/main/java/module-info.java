module view {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens view to javafx.fxml;
    exports view;
}
