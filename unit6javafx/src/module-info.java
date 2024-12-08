module unit6javafx {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
