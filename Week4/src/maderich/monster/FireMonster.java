package maderich.monster;

public class FireMonster extends Monster {
	public FireMonster(String name) {
		super(name);
	}
	public String attack() {
		return "Attack with fire!";
	}
	public void roar() {
			System.out.println("Roar");
	}
}
