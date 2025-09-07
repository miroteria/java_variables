public class Suspension2 {
	private Level suspensionStiffness;
	
	public enum Level {
		MIN(2),
		MIDDLE(6),
		MAX(12);
		
		private int levelIntensity;
		
		Level(int levelIntensity) {
			this.levelIntensity = levelIntensity;
		}
		
		public int getLevelIntensity() {
			return this.levelIntensity;
		}
	}
	
	public Level getSuspensionStiffness() {
		return suspensionStiffness;
	}

	public void setLevel(Level suspensionStiffness) {
		this.suspensionStiffness = suspensionStiffness;
	}
	
	public void printInfo() {
		System.out.println("Suspension stiffness is setup to: " + this.suspensionStiffness + 
				"and value is: " + this.suspensionStiffness.getLevelIntensity());
	}
}
