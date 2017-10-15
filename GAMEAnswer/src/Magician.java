
public class Magician extends Hero implements useMagic{
	
	Magician(String name) {
		super(name, 50);
		super.setShoe("Mage Shoe");
		super.setWeapon("Staff");
	}

	@Override
	public String castMagic() {
		// TODO Auto-generated method stub
		return "Fire ball!!";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "Attack with " + super.getWeapon() + "!!\n" + castMagic();
	}

	public String toString() {
		return "I am Magician!!"
				+ "\n" + super.toString();
	}
}
