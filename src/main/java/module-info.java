module com.example.csstry {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.csstry to javafx.fxml;
    exports com.example.csstry;
}