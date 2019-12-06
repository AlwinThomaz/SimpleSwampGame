package game;

import java.util.Random;
import java.util.Scanner;

public class App {

	private Random rand = new Random();
	private int goalX = rand.nextInt(20) - 10;
	private int goalY = rand.nextInt(20) - 10;
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		app.play();

	}

	public double getDistance() {
		return Math.hypot(goalX, goalY);
	}

	public void play() {
		System.out.println("Welcome to the swamp!");
		do {
			System.out.println("You are " + getDistance() + "m away");
			System.out.println("G0 N, S, E, W!");
			String direction = scanner.nextLine();
			switch (direction.toLowerCase()) { // switch when you have a lot of if else statements to do
			case "n":
			case "north":
				this.goalY--; // Increment decrease
				break;
			case "s":
			case "south":
				this.goalY++;
				break;
			case "e":
			case "east":
				this.goalX--;
				break;
			case "w":
			case "west":
				this.goalX++;
				break;
			default:
				System.out.println("WRONG!");

			}

		} while (getDistance() != 0);
		System.out.println("Congratulations, you won!");

	}
}
