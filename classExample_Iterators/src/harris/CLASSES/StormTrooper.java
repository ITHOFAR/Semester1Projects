package harris.CLASSES;

import java.util.Comparator;

public class StormTrooper {
	
	private String IDNumber;
	private int Height;
	private int Weight;
	private int Age;
	private int YearsOfService;
	private boolean isTrained;
	private boolean isEquipped;
	public StormTrooper(String iDNumber, int height, int weight, int age, int yearsOfService, boolean isTrained,
			boolean isEquipped) {
		super();
		this.IDNumber = iDNumber;
		this.Height = height;
		this.Weight = weight;
		this.Age = age;
		this.YearsOfService = yearsOfService;
		this.isTrained = isTrained;
		this.isEquipped = isEquipped;
	}
	
	@Override
	public String toString() {
		return "Stormtrooper [IDNumber: " + IDNumber + ", height: " + Height; 
	}
	
	public void displayStormtrooper() {
		System.out.println(this.toString());
	}
	
	public static class sortByName implements Comparator<StormTrooper> {
		@Override
		public int compare(StormTrooper s1, StormTrooper s2) {
			return s1.getIDNumber().compareTo(s2.getIDNumber());
		}
	}
	public static class sortByHeight implements Comparator<StormTrooper> {
		@Override
		public int compare(StormTrooper s1, StormTrooper s2) {
			return s2.getHeight() - s1.getHeight();
		}
	}
	
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getYearsOfService() {
		return YearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		YearsOfService = yearsOfService;
	}
	public boolean isTrained() {
		return isTrained;
	}
	public void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}
	public boolean isEquipped() {
		return isEquipped;
	}
	public void setEquipped(boolean isEquipped) {
		this.isEquipped = isEquipped;
	}
	
	
}
