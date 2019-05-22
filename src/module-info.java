module finalform {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires java.datatransfer;
    requires java.desktop;
    requires javafx.graphics;
    opens sample.Controller;
    opens sample;
}