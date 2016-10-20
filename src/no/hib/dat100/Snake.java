package no.hib.dat100;

public class Snake extends Object {
    private SnakeHead head;
    private SnakeBody body;

    public Snake(int x, int y, char renderObjectHead, char renderObjectBody, int length) {
        super(x, y, renderObjectHead);
        this.head = new SnakeHead(x, y, renderObjectHead);
        this.body = new SnakeBody(x, y, renderObjectBody, length);
    }

    public void Render(Screen sc) {
        this.body.Render(sc);
        this.head.Render(sc);
    }

    public void move(Direction dir) {
        this.body.move(this.head.getPos());
        this.head.move(dir);
    }
}
