package no.hib.dat100;

public class RenderObject {
    private Position pos;
    private Object obj;

    public RenderObject(Position pos, Object obj) {
        this.pos = pos;
        this.obj = obj;
    }

    public Position getPos() { return this.pos; }
    public Object getObj() { return this.obj; }
}
