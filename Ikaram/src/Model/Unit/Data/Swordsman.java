package Model.Unit.Data;

import Model.Unit.UnitMelee;

public class Swordsman extends UnitMelee {
	public Swordsman() {
		imgUrl = "/image/Swordsman.png";
		hitPoin = 18;
		armour = 0;
		size = 1;
		speed = 60;
		damage = 10;
		accuracy = 0.9f;
	}
}
