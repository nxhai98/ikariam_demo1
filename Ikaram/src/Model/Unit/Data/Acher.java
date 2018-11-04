package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Acher extends UnitMunition{
	public Acher() {
		imgUrl = "/image/ArcherBB.png";
		hitPoin = 16;
		armour = 0;		
		size = 1;
		speed = 60;
		munition = 3;
		firstWeaponAccuaracy = 0.4f;
		firstWeaponDamage = 5;
		secondWeaponAccuracy = 0.6f;
		secondWeaponDamage = 5;
	}
}
