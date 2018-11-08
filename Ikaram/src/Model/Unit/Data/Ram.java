package Model.Unit.Data;

import Model.Unit.UnitMunition;

public class Ram extends UnitMunition {
	public Ram() {
		// TODO Auto-generated constructor stub
		imgUrl = "/image/Ram.png";
		hitPoin = 88;
		armour = 1;		
		size = 5;
		speed = 40;		
		firstWeaponDamage = 80;
		firstWeaponAccuaracy = 0.1f;
		munition = -1; 					//khong can dan
		secondWeaponDamage = 12;
		secondWeaponAccuracy = 0.6f;
	}
	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return super.getDamage();
	}
}
