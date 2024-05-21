module studentManagementSystem {
	requires javafx.controls;
	exports studentmanagementsystem;
    requires java.sql;
	requires javafx.fxml;
	// Si vous utilisez une base de données

	opens studentmanagementsystem to javafx.graphics, javafx.fxml;
}
