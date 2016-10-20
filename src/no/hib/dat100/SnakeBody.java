package no.hib.dat100;

public class SnakeBody extends Object {
    public static final int MAX_LENGTH = 15; // Snake can not be longer than this.
    private int length; // Length of snake. Length 0 = Only snake head
    private Position[] body;

    public SnakeBody(int xHead, int yHead, char renderObject, int length) {
        super(xHead, yHead, renderObject);
        this.length = length;
        this.body = new Position[MAX_LENGTH];
        this.initBody();
    }

    public void Render(Screen sc) {
        for(int i = 0; i < this.length; i++) {
            sc.Add(body[i], (Object) this); // trengs cast?
        }
    }

    public void initBody() {
        for(int i = 0; i < this.length; i++) {
            this.body[i] = new Position(this.pos.getX() + (i + 1), this.pos.getY());
        }
    }

    public void move(Position headPos) {
        this.shift();
        this.body[0] = headPos;
    }

    private void shift() {
        for(int i = this.length; i >= 0 + 2; i--) {
            body[i - 1] = body[i - 2];
        }
    }
//
    public void healthUp() {
        this.length++;
    }

    public void healthDown() {
        this.length--;
    }
}
