module view {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javax.jms.api;
    requires mail;

    opens view to javafx.fxml;
    exports view;
}
