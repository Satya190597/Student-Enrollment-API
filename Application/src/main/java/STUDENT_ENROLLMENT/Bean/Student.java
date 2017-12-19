package STUDENT_ENROLLMENT.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int STUDENT_ID;
	private String STUDENT_NAME;
	private String STUDENT_EMAIL;
	private String STUDENT_CONTACTNO;
	
	public Student()
	{
		super();
	}

	public Student(int sTUDENT_ID, String sTUDENT_NAME, String sTUDENT_EMAIL, String sTUDENT_CONTACTNO) {
		super();
		STUDENT_ID = sTUDENT_ID;
		STUDENT_NAME = sTUDENT_NAME;
		STUDENT_EMAIL = sTUDENT_EMAIL;
		STUDENT_CONTACTNO = sTUDENT_CONTACTNO;
	}



	public int getSTUDENT_ID() 
	{
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(int sTUDENT_ID) 
	{
		STUDENT_ID = sTUDENT_ID;
	}

	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}

	public void setSTUDENT_NAME(String sTUDENT_NAME) 
	{
		STUDENT_NAME = sTUDENT_NAME;
	}

	public String getSTUDENT_EMAIL() {
		return STUDENT_EMAIL;
	}

	public void setSTUDENT_EMAIL(String sTUDENT_EMAIL) 
	{
		STUDENT_EMAIL = sTUDENT_EMAIL;
	}

	public String getSTUDENT_CONTACTNO() 
	{
		return STUDENT_CONTACTNO;
	}

	public void setSTUDENT_CONTACTNO(String sTUDENT_CONTACTNO) 
	{
		STUDENT_CONTACTNO = sTUDENT_CONTACTNO;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [STUDENT_ID=").append(STUDENT_ID).append(", STUDENT_NAME=").append(STUDENT_NAME)
				.append(", STUDENT_EMAIL=").append(STUDENT_EMAIL).append(", STUDENT_CONTACTNO=")
				.append(STUDENT_CONTACTNO).append("]");
		return builder.toString();
	}
	
	
	
}
