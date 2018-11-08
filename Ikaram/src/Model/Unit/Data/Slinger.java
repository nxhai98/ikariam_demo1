package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Slinger extends UnitMunition {
	public Slinger() {
		imgUrl = "/image/Slinger.png";
		hitPoin = 8;
		armour = 0;		
		size = 1;
		speed = 60;		
		firstWeaponDamage = 3;
		firstWeaponAccuaracy = 0.2f;
		munition = 5;
		secondWeaponDamage = 2;
		secondWeaponAccuracy = 0.6f;
	}
}
