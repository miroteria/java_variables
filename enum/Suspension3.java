public class Suspension3 {
	private Level suspensionStiffness;
	
	public enum LevelValue {
		MIN(2) {
			@Override
			public boolean isMin() {return true;}
		},
		MIDDLE(6) {
			@Override
			public boolean isMiddle() {return true;}
		},
		MAX(12) {
			@Override
			public boolean isMax() {return true;}
		};
		
		private int levelIntensity;
		
		public boolean isMin() {return false;}
		public boolean isMiddle() {return false;}
		public boolean isMax() {return false;}
		
		LevelValue(int levelIntensity) {
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
