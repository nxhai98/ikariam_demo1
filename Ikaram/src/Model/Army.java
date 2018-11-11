package Model;


public class Army {
	private int numberOfHop;
    private int numberOfSteam;

    private int numberOfSword;
    private int numberOfSpear;

    private int numberOfBalloon;
    private int numberOfGyrocopter;

    private int numberOfRam;
    private int numberOfCatapult;
    private int numberOfMotar;

    private int numberOfSlinger;
    private int numberOfArcher;
    private int numberOfSulphulCar;
    
    
    public static enum Unit {
        Archer(2, ""), Balloon(1, ""), Catapult(2, ""), Gyrocopter(1, ""), Hoplite(1, ""), Mortar(1, ""), Ram(3, ""), Slinger(3, ""), Spearman(2, ""), SteamGiant(2, ""), Sulfur(1, ""), Swordsman(1, ""), Wall(0, "");
        private int priorityInLine;
        private String img;

        private Unit(int prio, String img) {
            this.priorityInLine = prio;
            this.img = img;
        }

        public int getPriorityInLine() {
            return priorityInLine;
        }

        public void setPriorityInLine(int priorityInLine) {
            this.priorityInLine = priorityInLine;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

    }
    
    
    public int getNumberOfArcher() {
		return numberOfArcher;
	}
    public void setNumberOfArcher(int numberOfArcher) {
		this.numberOfArcher = numberOfArcher;
	}
    
    public int getNumberOfBalloon() {
		return numberOfBalloon;
	}
    public void setNumberOfBalloon(int numberOfBalloon) {
		this.numberOfBalloon = numberOfBalloon;
	}

    public int getNumberOfCatapult() {
		return numberOfCatapult;
	}
    public void setNumberOfCatapult(int numberOfCatapult) {
		this.numberOfCatapult = numberOfCatapult;
	}
    
    public int getNumberOfGyrocopter() {
		return numberOfGyrocopter;
	}
    public void setNumberOfGyrocopter(int numberOfGyrocopter) {
		this.numberOfGyrocopter = numberOfGyrocopter;
	}
    
    public int getNumberOfHop() {
		return numberOfHop;
	}
    public void setNumberOfHop(int numberOfHop) {
		this.numberOfHop = numberOfHop;
	}
    
    public int getNumberOfMotar() {
		return numberOfMotar;
	}
    public void setNumberOfMotar(int numberOfMotar) {
		this.numberOfMotar = numberOfMotar;
	}
    
    public int getNumberOfRam() {
		return numberOfRam;
	}
    public void setNumberOfRam(int numberOfRam) {
		this.numberOfRam = numberOfRam;
	}
    
    public int getNumberOfSlinger() {
		return numberOfSlinger;
	}
    public void setNumberOfSlinger(int numberOfSlinger) {
		this.numberOfSlinger = numberOfSlinger;
	}
    
    public int getNumberOfSpear() {
		return numberOfSpear;
	}
    public void setNumberOfSpear(int numberOfSpear) {
		this.numberOfSpear = numberOfSpear;
	}
    
    public int getNumberOfSteam() {
		return numberOfSteam;
	}
    public void setNumberOfSteam(int numberOfSteam) {
		this.numberOfSteam = numberOfSteam;
	}
    
    public int getNumberOfSulphulCar() {
		return numberOfSulphulCar;
	}
    public void setNumberOfSulphulCar(int numberOfSulphulCar) {
		this.numberOfSulphulCar = numberOfSulphulCar;
	}
    
    public int getNumberOfSword() {
		return numberOfSword;
	}
    public void setNumberOfSword(int numberOfSword) {
		this.numberOfSword = numberOfSword;
	}

    
    public int getNumberOf(Unit unit) {
		switch (unit) {
		case Archer:
			return getNumberOfArcher();
			
		case Balloon:
			return getNumberOfBalloon();
			
		case Catapult:
			return getNumberOfCatapult();
			
		case Gyrocopter:
			return getNumberOfGyrocopter();
			
		case Hoplite:
			return getNumberOfHop();
			
		case Mortar:
			return getNumberOfMotar();
			
		case Ram:
			return getNumberOfRam();
			
		case Slinger:
			return getNumberOfSlinger();
			
		case Spearman:
			return getNumberOfSpear();
			
		case SteamGiant:
			return getNumberOfSteam();
		
		case Sulfur:
			return getNumberOfSulphulCar();
			
		case Swordsman:
			return getNumberOfSword();	
		default:
			return 0;
		}
	}
    
    public String getImgUrlOf(Unit unit) {
    	switch (unit) {
	    	case Archer:
	            return "/image/ArcherBB.png";
	        case Balloon:
	            return "/image/Balloon-BombardierBB.png";
	        case Catapult:
	            return "/image/CatapultBB.png";
	        case Gyrocopter:
	            return "/image/GyrocopterBB.png";
	        case Hoplite:
	            return "/image/HopliteBB.png";
	        case Mortar:
	            return "/image/MortarBB.png";
	        case Ram:
	            return "/image/RamBB.png";
	        case Slinger:
	            return "/image/SlingerBB.png";
	        case Spearman:
	            return "/image/SpearmanBB.png";
	        case SteamGiant:
	            return "/image/SteamGiantBB.png";
	        case Sulfur:
	            return "/image/SulphurCarabineerBB.png";
	        case Swordsman:
	            return "/image/SwordsmanBB.png";
		default:
			return null;
		}
	}

    
    public void clear() {
		numberOfArcher = 0;
		numberOfBalloon = 0;
		numberOfCatapult = 0;
		numberOfGyrocopter = 0;
		numberOfGyrocopter = 0;
		numberOfHop = 0;
		numberOfMotar = 0;
		numberOfRam = 0;
		numberOfSlinger = 0;
		numberOfSpear = 0;
		numberOfSteam = 0;
		numberOfSulphulCar = 0;
		numberOfSword = 0;
	}
    
    public void addArmy(Army army) {
		this.numberOfArcher += army.numberOfArcher;
		this.numberOfBalloon += army.numberOfBalloon;
		this.numberOfCatapult += army.numberOfCatapult;
		this.numberOfGyrocopter += army.numberOfGyrocopter;
		this.numberOfHop += army.numberOfHop;
		this.numberOfMotar += army.numberOfMotar;
		this.numberOfRam += army.numberOfRam;
		this.numberOfSlinger += army.numberOfSlinger;
		this.numberOfSpear += army.numberOfSpear;
		this.numberOfSteam += army.numberOfSteam;
		this.numberOfSulphulCar += army.numberOfSulphulCar;
		this.numberOfSword += army.numberOfSword;
	}
    
    public void subArmy(Army army) {
    	this.numberOfArcher -= army.numberOfArcher;
		this.numberOfBalloon -= army.numberOfBalloon;
		this.numberOfCatapult -= army.numberOfCatapult;
		this.numberOfGyrocopter -= army.numberOfGyrocopter;
		this.numberOfHop -= army.numberOfHop;
		this.numberOfMotar -= army.numberOfMotar;
		this.numberOfRam -= army.numberOfRam;
		this.numberOfSlinger -= army.numberOfSlinger;
		this.numberOfSpear -= army.numberOfSpear;
		this.numberOfSteam -= army.numberOfSteam;
		this.numberOfSulphulCar -= army.numberOfSulphulCar;
		this.numberOfSword -= army.numberOfSword;
	}
    
    public int getTimeMoving() {
    	if (getNumberOfBalloon() > 0)
            return 30*60*1000/3;
        else if (getNumberOfSteam() > 0 
                || getNumberOfMotar() > 0 
                || getNumberOfCatapult() > 0 
                || getNumberOfRam() > 0)
            return 15*60*1000/3;
        else if (getNumberOfArcher() > 0 
                || getNumberOfSulphulCar() > 0 
                || getNumberOfSlinger() > 0
                || getNumberOfHop() > 0 
                || getNumberOfSpear() > 0)
            return 10*60*1000/3;
        
        return 75*6*1000; //airDefence Only
	}
 }