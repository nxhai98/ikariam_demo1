package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Balloon extends UnitMunition {
	public Balloon() {
		// TODO Auto-generated constructor stub
		imgUrl = "/image/Balloon-Bombardier.png";
		hitPoin = 40;
		armour = 0;		
		size = 2;
		speed = 20;		
		firstWeaponDamage = 48;
		firstWeaponAccuaracy = 0.2f;
		munition = 2;
		secondWeaponDamage = 0;
		secondWeaponAccuracy = 0f;
	}
}
