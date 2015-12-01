package pakage;

import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SixTwo extends Application {
/*
 * (non-Javadoc)
 * @see javafx.application.Application#start(javafx.stage.Stage)
 * Hugo Muro
 * 
 * Java Fx
 * CSC 200
 */
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Extra Credit");
		
		TextField TextFieldA1 = new TextField();
		TextField TextFieldA2 = new TextField();
		Label LabelA1 = new Label("First Number");
		Label LabelA2 = new Label("Second Number");
		
		
		Button EnterBttn = new Button("Calculate");
				
		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				

				String A1 = TextFieldA1.getText();
				String A2 = TextFieldA2.getText();
				
				double DoubleA1 = Double.parseDouble(A1);
				double DoubleA2 = Double.parseDouble(A2);
				
				JOptionPane.showMessageDialog(null, "The sum is: " + (DoubleA1+DoubleA2));
				
				
								
			}});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		
		grid.add(LabelA1,    0,0);
		grid.add(LabelA2,    0,1);
		grid.add(TextFieldA1,    1,0);
		grid.add(TextFieldA2,    1,1);
		
		grid.add(EnterBttn,  2,2);

		
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
