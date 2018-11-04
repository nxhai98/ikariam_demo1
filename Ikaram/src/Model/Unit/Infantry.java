package Model.Unit;

public class Infantry {
	protected int hitPoin;
	//protected int damage;
	protected int armour;	
	protected String imgUrl;
	protected int speed;
	protected int size;
	
	
	public void setHitPoin(int hitPoin) {
		this.hitPoin = hitPoin;		
	}
	public int getHitPoin() {
		return hitPoin;
	}
	
	//public void setDamage(int damage) {
	//	this.damage = damage;		
	//}
	//public int getDamage() {
	//	return damage;
	//}
	
	public void setArmour(int armour) {
		this.armour = armour;		
	}
	public int getArmour() {
		return armour;
		
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;		
	}
	public String getImgUrl() {
		return imgUrl;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getSize() {
		return size;
	}

		
}
