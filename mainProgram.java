public class mainProgram {
	public static void main(String[] args) {
		userChoices choice = new userChoices();
		story story = new story();
		
		story.startAdventure();
		choice.askLeftOrRight();
		
		if (choice.getRightOrLeft().equalsIgnoreCase("left")){
			story.badEnd();
		} 
		else {
			story.goodEnd();
		}
				
	}
}
