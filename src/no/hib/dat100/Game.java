package no.hib.dat100;

import java.util.concurrent.TimeUnit;

public class Game {
    private Screen sc;
    //private Ground ground;
    private Wall wall;
    private Snake snake;
    private Fruit fruit;

    public Game() {
        this.init();
    }

    public void start() {
        this.draw();
        for(int a = 0; a < 3; a++) {
            this.update();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.draw();
        }
    }

    public void init() {
        this.sc = new Screen(10, 30);
        this.snake = new Snake(2, 4, 'X', 'o', 3);
        this.fruit = new Fruit(4, 2, '*');
    }

    public void draw() {
        this.sc.initList();
        this.sc.Clear();
        this.snake.Render(sc);
        this.fruit.Render(sc); // fruit legges i rl
        this.sc.Render();
        
    }

    public void update() {
        this.snake.move(Direction.UP);
    }
}
