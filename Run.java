import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		System.out.println("Running Creature War:\nInput First army type:\n>");
		CreatureWar war = new CreatureWar();
		Scanner readInput = new Scanner(System.in);
		String army1 = readInput.nextLine();
		System.out.println("Input Second army type:\n>");
		String army2 = readInput.nextLine();
		readInput.close();
		war.runWar(army1, army2);
	}

}
