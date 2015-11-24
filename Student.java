import javax.swing.JOptionPane;
public class Student
{
	String studentName = "";
	
	static double testScore[] = { 0, 0, 0, 0 };

	double test1 = 0;
	double test2 = 0;
	double test3 = 0;
	double test4 = 0;
	double weight1 = 0;
	double weight2 = 0;
	double weight3 = 0;
	double weight4 = 0;
	double grade = 0;
	double testArray[] = {0,0,0,0,0,0,0,0};
	Student()
	{
		String studentName = "";
		test1 = 0.0;
		test2 = 0.0;
	    test3 = 0.0;
		test4 = 0.0;
		double StudentArray[] = {0, 0, 0, 0, 0, 0, 0, 0};
	}
	Student(String name, double firstTest, double secondTest, double thirdTest, double fourthTest, //
			double testArray[])
	{
		studentName = name;
		test1 = firstTest;
		test2 = secondTest;
		test3 = thirdTest;
		test4 = fourthTest;
		double test1Array[] = {test1, test2, test3, test4};
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		studentName = JOptionPane.showInputDialog(null, "Enter Student Name");
		this.studentName = studentName;
	}
	public double getTest1()
	{
		return test1;
	}
	public void setTest1(double test1)
	{
		this.test1 = test1;
	}
	public double getTest2()
	{
		return test2;
	}
	public void setTest2(double test2)
	{
		this.test2 = test2;
	}
	public double getTest3()
	{
		return test3;
	}
	public void setTest3(double test3)
	{
		this.test3 = test3;
	}
	public double getTest4()
	{
		return test4;
	}
	public void setTest4(double test4)
	{
		this.test4 = test4;
	}
	public double getWeight1()
	{
		return weight1;
	}
	public void setWeight1(double weight1)
	{
		this.weight1 = weight1;
	}
	public double getWeight2()
	{
		return weight2;
	}
	public void setWeight2(double weight2)
	{
		this.weight2 = weight2;
	}
	public double getWeight3()
	{
		return weight3;
	}
	public void setWeight3(double weight3)
	{
		this.weight3 = weight3;
	}
	public double getWeight4()
	{
		return weight4;
	}
	public void setWeight4(double weight4)
	{
		this.weight4 = weight4;
	}
	public String toString(double test1, double test2, double test3, double test4)
	{
		String string = "Test Scores... \n" + test1 + "\n"
				+ test2 + "\n"
				+ test3 + "\n"
				+ test4;
		return string;
	}
	public void grade()
	{
		double x = 0;
		x = (getTest1() * getWeight1()) + (getTest2() * getWeight2()) + (getTest3() * getWeight3()) + (getTest4() * getWeight4());
		System.out.println(x);
		gradePointAverage(x);
	}
	public void setGradeArray()
	{
		double StudentArray[] = { getTest1(), getTest2(), getTest3(), getTest4(), getWeight1(), getWeight2(), getWeight3(), getWeight4() };
	}
	private String gradePointAverage(double x)
	{
		String GradeLetter = "";
		grade = x;
		if(grade >= 90)
		{
			GradeLetter = "A";
			JOptionPane.showMessageDialog(null, grade + "% is letter Grade: " + GradeLetter);
		}
		if(grade >= 80 && grade < 90)
		{
			GradeLetter = "B";
			JOptionPane.showMessageDialog(null, grade + "% is letter Grade: " + GradeLetter);
		}
		if(grade >= 70 && grade < 80)
		{
			GradeLetter = "C";
			JOptionPane.showMessageDialog(null, grade + "% is letter Grade: " + GradeLetter);
		}
		if(grade >= 60 && grade < 70)
		{
			GradeLetter = "D";
			JOptionPane.showMessageDialog(null, grade + "% is letter Grade: " + GradeLetter);
		}
		if(grade < 60)
		{
			GradeLetter = "F";
			JOptionPane.showMessageDialog(null, grade + "% is letter Grade: " + GradeLetter);
		}
		return GradeLetter;
	}
	public int boolCheck(boolean x) {
		int y = 0;
		if (x == true)
		{
			y = 1;
		}
		if (x == false)
		{
			y = 0;
		}
		return y;
	}


}