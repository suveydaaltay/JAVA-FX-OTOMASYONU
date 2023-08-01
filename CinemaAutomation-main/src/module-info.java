module untitled {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires java.base;
    requires javafx.base;
    opens sample to javafx.base, javafx.controls,javafx.fxml,java.base,javafx.graphics;
}

