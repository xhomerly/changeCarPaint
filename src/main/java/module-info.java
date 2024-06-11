module com.xhomerly.mujprvniprojektnagitu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.xhomerly.mujprvniprojektnagitu to javafx.fxml;
    exports com.xhomerly.mujprvniprojektnagitu;
}