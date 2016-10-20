package no.hib.dat100;

public class TerminalSnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class Game {
    private Screen sc;
    //private Ground ground;
    private Fruit fruit;

    public Game() {
    }

    public void init() {
        this.sc = new Screen(20, 40);
        this.fruit = new Fruit(4, 6, '*');
    }

    public void draw() {
        this.fruit.Render(); // fruit legges i rl
        sc.Render();
        
    }
}
