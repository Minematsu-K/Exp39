class Dragon extends Monster {
	private int attack;

	Dragon(int attack) {
		this.attack = attack;
	}

	@Override
	public int calculateDamage() {
		return this.attack * 2;
	}
}