package harris.TIESPT;

public class Location {
	private int X;
	private int Y;
	private int Z;
	
	//CONSTRUCTOR
	public Location(int X, int Y, int Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	
	public String toString() {
		String output = String.format(
				"Location [X:%d, Y:%d, Z:%d]",
				this.X, this.Y, this.Z);
		return output;
	}

	//GETTERS AND SETTERS
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getZ() {
		return Z;
	}

	public void setZ(int z) {
		Z = z;
	}
	
	
}
