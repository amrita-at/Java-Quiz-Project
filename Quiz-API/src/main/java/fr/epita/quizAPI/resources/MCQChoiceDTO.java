package fr.epita.quizAPI.resources;


public class MCQChoiceDTO {
	
private Long id;
	
	private String choice;
	
	private boolean valid;
	
	private QuestionDTO question;
	
	public MCQChoiceDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public QuestionDTO getQuestion() {
		return question;
	}

	public void setQuestion(QuestionDTO question) {
		this.question = question;
	}

	public MCQChoiceDTO(Long id, String choice, boolean valid, QuestionDTO question) {
		this.id = id;
		this.choice = choice;
		this.valid = valid;
		this.question = question;
	}

}
