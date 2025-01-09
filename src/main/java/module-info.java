module org.yomirein.sochatjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.yomirein.sochatjava to javafx.fxml;
    exports org.yomirein.sochatjava;
}