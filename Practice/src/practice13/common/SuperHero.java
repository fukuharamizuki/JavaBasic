package practice13.common;

public class SuperHero extends Hero{

	private Item equipment;

	public SuperHero() {
		super();
	}

	public int attack() {
		return super.attack()+this.equipment.getAdditinalDamage();
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

}
