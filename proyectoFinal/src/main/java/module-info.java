module com.anramirez.proyectoFinal {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.anramirez.proyectoFinal to javafx.fxml;
    exports com.anramirez.proyectoFinal;
}