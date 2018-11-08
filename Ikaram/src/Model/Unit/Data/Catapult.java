package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Catapult extends UnitMunition {
	public Catapult() {
		// TODO Auto-generated constructor stub
		imgUrl = "/image/Catapult.png";
		hitPoin = 54;
		armour = 0;		
		size = 5;
		speed = 40;		
		firstWeaponDamage = 133;
		firstWeaponAccuaracy = 0.1f;
		munition = 5;
		secondWeaponDamage = 4;
		secondWeaponAccuracy = 0.2f;
	}
}
