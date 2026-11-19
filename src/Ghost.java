class Ghost extends Monster {
	private int magic;

	Ghost(int magic) {
		this.magic = magic;
	}

	@Override
	public int calculateDamage() {
		return this.magic * 3;
	}
}