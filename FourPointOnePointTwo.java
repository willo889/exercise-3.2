
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;

public class FourPointOnePointTwo extends Application 
{
	int trial =0;
	int limit = 3;
		@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Authentication");
		TextField userNameTxtFld = new TextField();
		TextField passWordTxtFld = new TextField();
		Label userNameLbl = new Label("UserName");
		Label passWordLbl = new Label("Password");
		Button submitBtn = new Button("Submit");
		

		
			
			submitBtn.setOnAction(new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent arg0)
				{
					
		
							System.out.println(trial);
								
							String userIn = userNameTxtFld.getText();
							String passIn = passWordTxtFld.getText();
							String corUser = "Will";
							String corPass = "Will";
		
							if (userIn.equals(corUser) && passIn.equals(corPass))
							{
								JOptionPane.showMessageDialog(null, "Welcome");
								System.exit(0);
							}
							else
							{
							
								trial++;
								System.out.println("Wrong " + trial);
							}
													
							if (trial == limit){
								System.out.println("Locked Out");

								System.exit(0);
							}
				}
				});
				System.out.println("Runs");
		

	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setVgap(10);
	grid.setHgap(10);
	
	grid.add(userNameLbl,0,0);
	grid.add(passWordLbl,0,1);
	grid.add(userNameTxtFld,1,0);
	grid.add(passWordTxtFld,1,1);
	grid.add(submitBtn,1,2);
	
	Scene scene = new Scene(grid, 500, 500);
	primaryStage.setScene(scene);
	primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
	

}
