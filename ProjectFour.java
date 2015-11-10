
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

public class ProjectFour extends Application {

	@Override
	
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Project Four");
		TextField UserTxt = new TextField();
		PasswordField PassTxt = new PasswordField();
		PasswordField ConfPassTxt = new PasswordField();
		TextField FNameTxt = new TextField();
		TextField LNameTxt = new TextField();
		TextField EmailTxt = new TextField();
		Label UserLabel = new Label("Username");
		Label PassLabel = new Label("Password");
		Label ConfPassLabel = new Label("Confirm Password");
		Label FNameLabel = new Label("First Name");
		Label LNameLabel = new Label("Last Name");
		Label EmailLabel = new Label("Email");
		Label comboBox = new Label("Account");
		Label BadPass = new Label("Passwords Must Match");
		Button EnterBttn = new Button("Sign Up");
		
		FNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		LNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		UserTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		EmailTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		ComboBox<String> myComboBox = new ComboBox<String>();
		myComboBox.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		BadPass.setVisible(false);
		myComboBox.getItems().addAll("", "Admin", "Staff", "Faculty", "Student", "Guest");
		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				BadPass.setVisible(false);
				myComboBox.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				FNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				LNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				UserTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				EmailTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				boolean UNTrue = false;
				boolean PWTrue = false;
				boolean FNameTrue = false;
				boolean LNameTrue = false;
				boolean EmailTrue = false;
				boolean CPWTrue = false;
				boolean PassWordCorrect = false;
				boolean EmailBool = false;
				boolean AccSignTrue = false;
				boolean ComboBool = false;
				String Combo = myComboBox.getValue();
				String FName = FNameTxt.getText();
				String LName = LNameTxt.getText();
				String UserName = UserTxt.getText();
				String PassWord = PassTxt.getText();
				String Email = EmailTxt.getText();
				String ConfirmPass = ConfPassTxt.getText();
					if (!Combo.equals(""))
					{
						myComboBox.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						ComboBool = true;
					}
					if(!FName.equals(""))
					{
						FNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						FNameTrue = true;
					}
					if(!LName.equals(""))
					{
						LNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						LNameTrue = true;
					}
					if(!UserName.equals(""))
					{
						UserTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						UNTrue = true;
					}
					if(!PassWord.equals(""))
					{
						PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");	
					}
					if(!Email.equals(""))
					{
						EmailTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						EmailTrue = true;
					}
					if(!ConfirmPass.equals(""))
					{
						ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					if (!PassWord.equals(ConfirmPass))
					{
						System.out.println("Hitting this mark");
						ConfPassTxt.setStyle("-fx-border-color: red; -fx-padding: 7px;");
						PassTxt.setStyle("-fx-border-color: red; -fx-padding: 7px;");
						JOptionPane.showMessageDialog(null, "Password and Confirm Password must be the same");
						BadPass.setTextFill(Color.RED);
						BadPass.setVisible(true);
						CPWTrue = false;
						PWTrue= false;
					}
					if(PassWord.length() < 8)
					{
						JOptionPane.showMessageDialog(null, "Password must be 8 characters or longer");
					}
					if (PassWord.equals(ConfirmPass) && (PassWord.length() > 7))
					{
							if (PassWord.matches(".*[a-z].*") && PassWord.matches(".*[A-Z].*") && PassWord.matches(".*[0-9].*"))
							{
								if(PassWord.matches(".*[!-/].*") || PassWord.matches(".*[:-@].*") || PassWord.matches(".*[Z-`].*") || PassWord.matches(".*[{-~].*"))
								{
									System.out.println("Contains lower, upper, and digit, and special");
									ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
									PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
									PWTrue = true;
									CPWTrue = true;
									PassWordCorrect = true;
								}
								else
								{
									System.out.println("invalid");//working
									PassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
									ConfPassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
									JOptionPane.showMessageDialog(null, "Password must contain a lower case, an upper case, a number and a special character!");
								}
							}
						}
							if(FNameTrue == false)
							{
								FNameTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");		
							}
							if(LNameTrue == false)
							{
								LNameTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
							if(UNTrue == false)
							{
								UserTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
							if(PWTrue == false)
							{
								PassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
							if(EmailTrue == false)
							{
								EmailTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
							if(CPWTrue == false)
							{
								ConfPassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
							if(ComboBool == false)
							{
								myComboBox.setStyle("-fx-border-color: red; -fx-padding: 3px;");
							}
						if(Email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$"))
								{
									System.out.println("Good Email");
									EmailBool = true;
								}
								else
								{
									System.out.println("Bad Email");
									EmailTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
								}
						if((EmailBool == true) && (PassWordCorrect == true) && (FNameTrue == true) && (LNameTrue == true) && (UNTrue == true) //
								&& (PWTrue == true) && (EmailTrue == true) && (CPWTrue == true) && (ComboBool == true))
						{ 
							AccSignTrue = true;
							if (AccSignTrue == true)
							{
							System.out.println("Everything Bueno");
							System.out.println(Combo.toString());
							AccountMade account3 = new AccountMade(UserName, PassWord, Combo);
							account3.toString(account3.userName, account3.passWord, account3.accType);
							System.exit(0);
							}
						}
			}});
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(UserLabel, 0,0);
		grid.add(PassLabel, 0,1);
		grid.add(ConfPassLabel, 0,2);
		grid.add(FNameLabel, 0,3);
		grid.add(LNameLabel, 0,4);
		grid.add(EmailLabel, 0,5);
		grid.add(UserTxt, 1,0);
		grid.add(PassTxt, 1,1);
		grid.add(ConfPassTxt, 1,2);
		grid.add(FNameTxt, 1,3);
		grid.add(LNameTxt, 1,4);
		grid.add(EmailTxt, 1,5);
		grid.add(EnterBttn, 1,7);
		grid.add(myComboBox, 1, 6);
		grid.add(comboBox, 0, 6);
		grid.add(BadPass, 1, 8);
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		public static void main(String[] args) {
			launch(args);
		}
	}