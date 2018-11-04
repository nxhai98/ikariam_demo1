package Model.Unit;

public class UnitMunition extends Infantry {
	protected int munition;
	protected int firstWeaponDamage;
	protected int secondWeaponDamage;
	protected float firstWeaponAccuaracy;
	protected float secondWeaponAccuracy;
	
	public void setMunition(int munition) {
		this.munition = munition;
	}
	public int getMunition() {
		return munition;
	}

	public int getDamage() {
		if (munition > 0) {
			return firstWeaponDamage;
		}
		else {
			return secondWeaponDamage;
		}
	}
	public void setDamage(int damage) {
		if(munition > 0)
			firstWeaponDamage = damage;
		secondWeaponDamage = damage;
	}

	public float getAccuaracy() {
		if (munition > 0) {
			return firstWeaponAccuaracy;
		}
		return secondWeaponAccuracy;
	}
}
