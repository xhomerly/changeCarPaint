module com.xhomerly.mujprvniprojektnagitu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.xhomerly.mujprvniprojektnagitu to javafx.fxml;
    exports com.xhomerly.mujprvniprojektnagitu;
}