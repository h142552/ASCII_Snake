package no.hib.dat100;

public class SnakeHead extends Object {
    public SnakeHead(int x, int y, char renderObject) {
        super(x, y, renderObject);
    }

    public Position getPos() { return this.pos; }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                this.pos = new Position(this.pos.getX(), this.pos.getY() - 1);
                break;
            case DOWN:
                this.pos = new Position(this.pos.getX(), this.pos.getY() + 1);
                break;
            case LEFT:
                this.pos = new Position(this.pos.getX() - 1, this.pos.getY());
                break;
            case RIGHT:
                this.pos = new Position(this.pos.getX() + 1, this.pos.getY());
                break;
        }
    }

    public void Render(Screen sc) {
        super.Render(sc);
    }
}
