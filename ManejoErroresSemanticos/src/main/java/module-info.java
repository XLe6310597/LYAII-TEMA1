module aldrichsystems.manejoerroressemanticos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens aldrichsystems.manejoerroressemanticos to javafx.fxml;
    exports aldrichsystems.manejoerroressemanticos;
}