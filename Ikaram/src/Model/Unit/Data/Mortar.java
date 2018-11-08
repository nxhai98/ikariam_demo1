package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Mortar extends UnitMunition {
	public Mortar() {
		// TODO Auto-generated constructor stub
		imgUrl = "/image/Mortar.png";
		hitPoin = 32;
		armour = 0;		
		size = 5;
		speed = 40;		
		firstWeaponDamage = 270;
		firstWeaponAccuaracy = 0.1f;
		munition =3;
		secondWeaponDamage = 10;
		secondWeaponAccuracy = 0.2f;
	}
}
