package harris.CLASSES;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import harris.MAIN.FileManager;

public class STBuilder implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int buildCapacity;
	private ArrayList<StormTrooper> storage;
	
	public STBuilder(String name, int buildCapacity) {
		super();
		this.name = name;
		this.buildCapacity = buildCapacity;
		this.storage = new ArrayList<>();
	}

	public void buildTrooper(int amount) {
		Random R = new Random();
		for (int i = 0; i < amount; i++) {
			String ID = "S" + (i + 1);
			int Height = R.nextInt(4) + 72;
			int Weight = (int)(Height * 3.2);
			int Age = R.nextInt(10) + 20;
			int YOS = R.nextInt(8);
			StormTrooper s = new StormTrooper(ID, Height, Weight, Age, YOS, false, false);
			this.storage.add(s);
		}
	}
	
	public void store() throws FileNotFoundException, IOException{
		int i = 0;
		ObjectOutputStream output = null;
		while (i < this.storage.size()) {
			output = new ObjectOutputStream(new FileOutputStream(FileManager.Primary.getFilepath()));
			output.writeObject(this.storage.get(i));
		}
		output.close();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuildCapacity() {
		return buildCapacity;
	}

	public void setBuildCapacity(int buildCapacity) {
		this.buildCapacity = buildCapacity;
	}

	public ArrayList<StormTrooper> getStorage() {
		return storage;
	}

	public void setStorage(ArrayList<StormTrooper> storage) {
		this.storage = storage;
	}
	
}
