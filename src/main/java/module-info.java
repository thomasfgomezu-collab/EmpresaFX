module co.uniquindio.edu.empresafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.empresafx to javafx.fxml;
    exports co.uniquindio.edu.empresafx;
    exports co.uniquindio.edu.empresafx.viewController;
    opens co.uniquindio.edu.empresafx.viewController to javafx.fxml;

}
