package no.hib.dat100;

import java.util.concurrent.TimeUnit;

public class Game {
    private Screen sc;
    //private Ground ground;
    private Level level;
    private static String levelStr = (
                    "##############################" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "#                            #" + 
                    "##############################");
    private Snake snake;
    private Fruit fruit;

    public Game() {
        this.init();
    }

    public void start() {
        this.draw();
        for(int a = 0; a < 7; a++) {
            this.update();
            this.draw();
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void init() {
        this.sc = new Screen(10, 30);
        this.level = new Level(10, 30, levelStr);
        this.snake = new Snake(4, 7, 'O', 'o', 3);
        this.fruit = new Fruit(4, 2, '*');
    }

    public void draw() {
        this.sc.Clear();
        //this.sc.initList();
        this.level.Render(sc);
        this.fruit.Render(sc);
        this.snake.Render(sc);
        this.sc.Render();
        
    }

    public void update() {
        this.snake.move(Direction.UP);
    }
}
