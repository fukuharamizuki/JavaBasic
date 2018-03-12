package practice13.common;

public class Item {
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private int additionalDamage	;

	public int getAdditinalDamage() {
		return this.additionalDamage;
	}
	public void setAdditionalDamage(int additinalDamage) {
		this.additionalDamage = additinalDamage;
	}

	public Item(String name, int additinalDamage){
		this.name = name;
		this.additionalDamage = additinalDamage;
	}

}
