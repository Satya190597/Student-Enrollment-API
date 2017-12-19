package STUDENT_ENROLLMENT.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subjects 
{
	@Id
	private  int SUBJECT_ID;
	private String SUBJECT_NAME;
	private String SUBJECT_DISCRIPTION;
	public Subjects(int sUBJECT_ID, String sUBJECT_NAME, String sUBJECT_DISCRIPTION) {
		super();
		SUBJECT_ID = sUBJECT_ID;
		SUBJECT_NAME = sUBJECT_NAME;
		SUBJECT_DISCRIPTION = sUBJECT_DISCRIPTION;
	}
	public Subjects() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSUBJECT_ID() 
	{
		return SUBJECT_ID;
	}
	public void setSUBJECT_ID(int sUBJECT_ID) 
	{
		SUBJECT_ID = sUBJECT_ID;
	}
	public String getSUBJECT_NAME() 
	{
		return SUBJECT_NAME;
	}
	public void setSUBJECT_NAME(String sUBJECT_NAME) 
	{
		SUBJECT_NAME = sUBJECT_NAME;
	}
	public String getSUBJECT_DISCRIPTION() 
	{
		return SUBJECT_DISCRIPTION;
	}
	public void setSUBJECT_DISCRIPTION(String sUBJECT_DISCRIPTION) 
	{
		SUBJECT_DISCRIPTION = sUBJECT_DISCRIPTION;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Subjects [SUBJECT_ID=").append(SUBJECT_ID).append(", SUBJECT_NAME=").append(SUBJECT_NAME)
				.append(", SUBJECT_DISCRIPTION=").append(SUBJECT_DISCRIPTION).append("]");
		return builder.toString();
	}
}
