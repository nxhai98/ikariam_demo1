package Model.Unit;


//quan can chien

public class UnitMelee extends Infantry{
	protected int damage;
	protected float accuracy;
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}
	
	public float getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}
	
}
