module com.example.pilasemantica {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.monica.pilasemantica to javafx.fxml;
    exports com.monica.pilasemantica;
}