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
import javafx.stage.Stage;
public class FourPointOnePointOne  extends Application
{
	
	public static void main(String args[])
	{

		launch(args);

		
	}

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

			@Override
			public void handle(ActionEvent arg0){
				int index = 0;
				String inputU = "";
				String inputP = "";//various inputs for user name, password and account
				String inputA = "";

				String[] correctUserName = { "Oliver", "Barry", "Hal" };
				String[] correctPassWord = { "Queen", "Allen", "Jordan" };//3 arrays for user, pass and account
				String[] correctAccount = { "Admin", "Student", "Staff" };//all lined up
				boolean indexAuth = false;
				boolean AccBool = false;//booleans..duh

				System.out.println("Chceking Step 1");
				inputU = userNameTxtFld.getText();
				inputP = passWordTxtFld.getText();
				
				while (index < 3 && indexAuth == false)//after input username and password checks to see if its correct
					//as soon as either the index = 3 or user enters correct information
				{
					System.out.println("Chceking Step 2");
					if ((inputU.equals(correctUserName[index])) && (inputP.equals(correctPassWord[index])))
					{
						System.out.println("Welcome User");
						indexAuth = true;
					}
					else
					{
						index ++;
						System.out.println("Chceking Step 3");
					}
				}
				if (indexAuth == true)//then ask for user to enter account type
				{	
					do
					{
						inputA = (String) JOptionPane.showInputDialog(null, "Select Account", "Choose Account",//
								JOptionPane.QUESTION_MESSAGE, null, correctAccount, correctAccount[0]);
						if (inputA.equals(correctAccount[index]))//if account entry is correct
						{
							JOptionPane.showMessageDialog(null, "Welcome " + inputU + ", you are " + inputA);
							AccBool = true;
							
						}
						else//if its incorrect
						{
							JOptionPane.showMessageDialog(null, "Invalid Account Selection", "Warning", JOptionPane.WARNING_MESSAGE);
						}
					}while (AccBool == false);
					System.exit(0); //ends program after do..while loop
							
				}
				else//if the user has entered invalid username or password
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Warning", JOptionPane.WARNING_MESSAGE);
				}

					}
			
			});

				
		
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
}
