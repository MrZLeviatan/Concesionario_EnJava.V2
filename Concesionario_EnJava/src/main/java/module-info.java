module view {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javax.jms.api;
    requires mail;
    requires java.desktop;

    opens view to javafx.fxml;
    exports view;
}
