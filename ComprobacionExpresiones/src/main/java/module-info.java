module com.example.comprobacionexpresiones {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.monica.comprobacionexpresiones to javafx.fxml;
    exports com.monica.comprobacionexpresiones;
}