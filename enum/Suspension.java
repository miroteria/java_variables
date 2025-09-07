public class Suspension {
	private Level suspensionStiffness;
	
	public enum Level {
		MIN,
		MIDDLE,
		MAX;
	}

	public Level getSuspensionStiffness() {
		return suspensionStiffness;
	}

	public void setLevel(Level suspensionStiffness) {
		this.suspensionStiffness = suspensionStiffness;
	}
	
	public void printInfo() {
		System.out.println("Suspension stiffness is setup to: " + this.suspensionStiffness);
	}
}
