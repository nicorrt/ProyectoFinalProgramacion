module com.anramirez.proyectoFinal {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;

    opens com.anramirez.proyectoFinal to javafx.fxml;
    exports com.anramirez.proyectoFinal;
}