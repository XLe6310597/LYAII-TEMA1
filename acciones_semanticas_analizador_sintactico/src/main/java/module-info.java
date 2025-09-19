module andisystem.acciones_semanticas_analizador_sintactico {
    requires javafx.controls;
    requires javafx.fxml;

    opens andisystem.acciones_semanticas_analizador_sintactico to javafx.fxml;

    opens andisystem.acciones_semanticas_analizador_sintactico.model to javafx.base;

    exports andisystem.acciones_semanticas_analizador_sintactico;
    exports andisystem.acciones_semanticas_analizador_sintactico.model;
    exports andisystem.acciones_semanticas_analizador_sintactico.exceptions;
}