package no.hib.dat100;

import java.util.HashMap;

public class Screen {
    private HashMap<Position, Object> renderList;
    private int height;
    private int width;

    public Screen(int height, int width) {
        this.height = height;
        this.width = width;

        this.initList(height, width);
    }

    public void Render(){
        for(Position pos.getX() : renderList.keyset()) {
            if(o == null)
                System.out.print(Ground.getRenderObject);
            else
                System.out.print(o.getRenderObject());
        }
    }

    public void Add(Position pos, Object obj) {
        this.renderList.put(pos, obj);
    }

    public void Delete() {}

    public void initList(int height, int width) { // Needs to have all positions
        for(int i = 0; i < height; i++) {       // i = y
            for(int j = 0; j < width; j++) {    // j = x
                this.renderList.put(new Position(j, i), null);
        }
    }
}
