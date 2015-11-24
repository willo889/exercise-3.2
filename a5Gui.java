import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class a5Gui extends Application {

	@Override
	public void start(Stage primaryStage)
	{
		String studentName = "";
		TextField test1Field = new TextField();
		TextField test2Field = new TextField();
		TextField test3Field = new TextField();
		TextField test4Field = new TextField();
		TextField weight1Field = new TextField();
		TextField weight2Field = new TextField();
		TextField weight3Field = new TextField();
		TextField weight4Field = new TextField();
		Label test1Label = new Label("Test 1");
		Label test2Label = new Label("Test 2");
		Label test3Label = new Label("Test 3");
		Label test4Label = new Label("Test 4");
		Label weight1Label = new Label("Weight 1");
		Label weight2Label = new Label("Weight 2");
		Label weight3Label = new Label("Weight 3");
		Label weight4Label = new Label("Weight 4");
		Button calcGrade = new Button("Calculate Grade");
		Student newStudent = new Student();
		System.out.println(newStudent);
		TextField[] fieldsWeightsTests = { test1Field, test2Field, test3Field, test4Field, weight1Field, weight2Field, weight3Field, weight4Field };
		newStudent.setStudentName(studentName);
		Label studentLabel = new Label("Student: " + newStudent.studentName);
		
		calcGrade.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				test1Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				test2Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				test3Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				test4Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weight1Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weight2Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weight3Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weight4Field.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				
				double test1 = 0.0;
				double test2 = 0.0;
				double test3 = 0.0;
				double test4 = 0.0;
				double weight1 = 0.0;
				double weight2 = 0.0;
				double weight3 = 0.0;
				double weight4 = 0.0;
				double[] testAndWeights = { test1, test2, test3, test4, weight1, weight2, weight3, weight4 };
				boolean test1bool = false;
				boolean test2bool = false;
				boolean test3bool = false;
				boolean test4bool = false;
				boolean weight1bool = false;
				boolean weight2bool = false;
				boolean weight3bool = false;
				boolean weight4bool = false;
				boolean weightTotalBool = false;
				boolean[] bools = { test1bool, test2bool, test3bool, test4bool, weight1bool, weight2bool, weight3bool, weight4bool };
				
				
				for(int i = 0; i < 8;i++)
				{
					if (fieldsWeightsTests[i].getText().isEmpty())
					{
						fieldsWeightsTests[i].setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					else
					{
						if(fieldsWeightsTests[i].getText().matches("[^0-9]"))
						{
							fieldsWeightsTests[i].setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
						}
						if (fieldsWeightsTests[i].getText().matches("\\d+\\.\\d+") || (fieldsWeightsTests[i].getText().matches("\\d+")))
						{
							testAndWeights[i] = Double.parseDouble(fieldsWeightsTests[i].getText());
							System.out.println("hitting");
							bools[i] = true;
							System.out.println(bools[i]);
							fieldsWeightsTests[i].setStyle("-fx-border-color: black; -fx-padding: 3px;");
						}
						else
						{
							fieldsWeightsTests[i].setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
						}
					}
					System.out.println(i);
				}
				
				double weights = weight1 + weight2 + weight3 + weight4;
				if (weights < 1)
				{
					weightTotalBool = true;
				}
				else
				{
					weight1Field.setStyle("-fx-border-color: red; -fx-padding: 3px;");
					weight2Field.setStyle("-fx-border-color: red; -fx-padding: 3px;");
					weight3Field.setStyle("-fx-border-color: red; -fx-padding: 3px;");
					weight4Field.setStyle("-fx-border-color: red; -fx-padding: 3px;");
					JOptionPane.showMessageDialog(null, "Weights cannot total more than 1");
				}
				int boolTrue = 0;
				for(int x = 0; x < 8;x++)
				{
					boolTrue =  boolTrue + newStudent.boolCheck(bools[x]);
				}
				if (boolTrue == 8);
				{
					newStudent.setGradeArray();
					newStudent.setTest1(Double.parseDouble(fieldsWeightsTests[0].getText()));
					newStudent.setTest2(Double.parseDouble(fieldsWeightsTests[1].getText()));
					newStudent.setTest3(Double.parseDouble(fieldsWeightsTests[2].getText()));
					newStudent.setTest4(Double.parseDouble(fieldsWeightsTests[3].getText()));
					newStudent.setWeight1(Double.parseDouble(fieldsWeightsTests[4].getText()));
					newStudent.setWeight2(Double.parseDouble(fieldsWeightsTests[5].getText()));
					newStudent.setWeight3(Double.parseDouble(fieldsWeightsTests[6].getText()));
					newStudent.setWeight4(Double.parseDouble(fieldsWeightsTests[7].getText()));
					newStudent.grade();
				}
			}
			
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(test1Label, 0,0);
		grid.add(test2Label, 0,1);
		grid.add(test3Label, 0,2);
		grid.add(test4Label, 0,3);
		grid.add(test1Field, 1,0);
		grid.add(test2Field, 1,1);
		grid.add(test3Field, 1,2);
		grid.add(test4Field, 1,3);
		grid.add(weight1Label, 2,0);
		grid.add(weight2Label, 2,1);
		grid.add(weight3Label, 2,2);
		grid.add(weight4Label, 2,3);
		grid.add(weight1Field, 3,0);
		grid.add(weight2Field, 3,1);
		grid.add(weight3Field, 3,2);
		grid.add(weight4Field, 3,3);
		grid.add(calcGrade, 1,4);
		grid.add(studentLabel, 3,4);
		Scene testScene = new Scene(grid, 500, 500);
		primaryStage.setScene(testScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}