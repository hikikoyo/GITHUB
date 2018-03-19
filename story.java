public class story{

	public void startAdventure(){
		System.out.println("Welcome to a text adventure!");
		System.out.println("It is a dark and windy night and you are riding your magic pony home.");
		System.out.println("From the drakness there rises a fork in the road causing you to pick right or left.");
		System.out.println("Do you choose the Right or Left?");
	}
	public void badEnd(){
		System.out.println("");
		System.out.println("You fell into a pit trap.");
		System.out.println("You died.");
		System.out.println("BAD END");
	}
	public void goodEnd(){
		System.out.println("You chose the safe route and returned home with no problems.");
		System.out.println("GOOD END");
	}
}
