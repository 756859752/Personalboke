package DTO;

import java.util.ArrayList;
import java.util.List;


import com.pojo.Question;

public class Questions {
	ArrayList<Question> question;

	public ArrayList<Question> getQuestion() {
		return question;
	}

	public void setQuestion(ArrayList<Question> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [question=" + question + "]";
	}
	
	
}
