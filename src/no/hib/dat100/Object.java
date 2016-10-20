package no.hib.dat100;

public class Object implements Render{
    protected Position pos;
    protected char renderObject; // this is the symbol that is rendered to the screen

    public Object(int x, int y, char renderObject) {
        this.pos = new Position(x, y);
        this.renderObject = renderObject;
    }

    public Position getPosition() { return this.pos; }
    public char getRenderObject() { return this.renderObject; }

    public void setPosition(Position pos) { this.pos = pos; }
    public void setRenderObject(char c) { this.renderObject = c; }

    public void Render(Screen sc) {
        sc.Add(pos, (Object) this); // trengs cast?
    }
}
