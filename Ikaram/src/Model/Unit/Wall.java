package Model.Unit;


public class Wall {
	
	private int level;
	private int garisionLimit;
	private int damage;
	private int hitPoint;
	private int armour;
	private float accuracy;
	private int size;
	private	String imageUrl = "/image/wall.png";
	
	public Wall(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
		setByLevel();	
	}
	
	private void setByLevel() {
		if (level == 0) {
            garisionLimit = 300;
            hitPoint = 0;
            armour = 0;
            damage = 0;
            accuracy = 0;
        } else {
            garisionLimit = 300 + level * 50;
            hitPoint = 150 + 50 * (level - 1);
            armour = 4 * level;
        }
        if (level > 0 && level < 10) {
            damage = 12 + 2 * (level - 1);
            accuracy = 0.3f;
        } else if (level >= 10 && level < 20) {
            damage = 80 + (level - 10) * 5;
            accuracy = 0.5f;

        } else if (level >= 20) {
            damage = 250 + (level - 20) * 10;
            accuracy = 0.8f;
        }
        if(level<17)
            size = 30;
        else if(level<25)
            size = 40;
        else
            size = 50;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public float getAccuracy() {
		return accuracy;
	}
	
	public int getArmour() {
		return armour;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getHitPoint() {
		return hitPoint;
	}
	
	public int getGarisionLimit() {
		return garisionLimit;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public int getSize() {
		return size;
	}
}
