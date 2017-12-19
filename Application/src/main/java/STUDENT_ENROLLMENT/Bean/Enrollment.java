package STUDENT_ENROLLMENT.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enrollment 
{
	@Id
	private int ENROLLMENT_ID;
	private String STUDENT_ID;
	private String SUBJECT_ID;
	
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Enrollment(int eNROLLMENT_ID, String sTUDENT_ID, String sUBJECT_ID) {
		super();
		ENROLLMENT_ID = eNROLLMENT_ID;
		STUDENT_ID = sTUDENT_ID;
		SUBJECT_ID = sUBJECT_ID;
	}
	
	public int getENROLLMENT_ID() {
		return ENROLLMENT_ID;
	}
	public void setENROLLMENT_ID(int eNROLLMENT_ID) {
		ENROLLMENT_ID = eNROLLMENT_ID;
	}
	public String getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(String sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public String getSUBJECT_ID() {
		return SUBJECT_ID;
	}
	public void setSUBJECT_ID(String sUBJECT_ID) {
		SUBJECT_ID = sUBJECT_ID;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enrollment [ENROLLMENT_ID=").append(ENROLLMENT_ID).append(", STUDENT_ID=").append(STUDENT_ID)
				.append(", SUBJECT_ID=").append(SUBJECT_ID).append("]");
		return builder.toString();
	}
	
}
