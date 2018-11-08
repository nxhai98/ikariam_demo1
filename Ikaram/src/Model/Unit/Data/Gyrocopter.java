package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Gyrocopter extends UnitMunition {
	public Gyrocopter() {
		// TODO Auto-generated constructor stub
		imgUrl = "/image/Balloon-Bombardier.png";
		hitPoin = 29;
		armour = 0;		
		size = 1;
		speed = 80;		
		firstWeaponDamage = 17;
		firstWeaponAccuaracy = 0.8f;
		munition = 4;
		secondWeaponDamage = 0;
		secondWeaponAccuracy = 0f;
	}
}
