class Exp39_1 {
	public static void main(String[] args) {
		Dragon dragon = new Dragon(50);
		Ghost ghost = new Ghost(40);

		dragon.setName("ファイアドラゴン");
		ghost.setName("ダークゴースト");

		dragon.showName();
		ghost.showName();
	}
}