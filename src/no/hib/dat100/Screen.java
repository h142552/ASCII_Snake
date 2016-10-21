package no.hib.dat100;

import java.io.IOException;
import java.util.HashMap;

public class Screen {
    //private HashMap<Position, Object> renderList;
    //private RenderObject[][] rl; // sorted array
    private Object[][] rl; // sorted array
    private int height;
    private int width;

    public Screen(int height, int width) {
        this.height = height;
        this.width = width;

        this.rl = new Object[this.width][this.height];
        this.initList();
    }

    public void Render(){
        for(int i = 0; i < this.height; i++) {          // i = y
            for(int j = 0; j < this.width; j++) {       // j = x
                //Object o = renderList.get(new Position(j, i));
                Object o = rl[j][i];
                if(o == null)
                    //System.out.print('l');
                    System.out.print(Ground.getRenderObject());
                else
                    //System.out.print('*');
                    System.out.print(o.getRenderObject());
            }
            System.out.println();
        }
    }

    public void Clear() {
    	//try {
            //Runtime.getRuntime().exec("clear");
	//} catch (IOException e) {
            //e.printstacktrace();
	//} 
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void Add(Object obj) {
        //this.renderlist.put(pos, obj);
        //this.rl[pos.getx()][pos.gety()] = new renderobject(pos, obj);
        this.rl[obj.getPosition().getX()][obj.getPosition().getY()] = obj;
        //this.renderlist.replace(pos, obj);
    }

    public void Add(Position pos, Object obj) {
        this.rl[pos.getX()][pos.getY()] = obj;
    }

    public void Delete() {}

    public void initList() { // needs to have all positions
        //this.renderlist = new hashmap<position, object>();
        for(int i = 0; i < this.height; i++) {       // i = y
            for(int j = 0; j < this.width; j++) {    // j = x
                //this.renderlist.put(new position(j, i), null);
                this.rl[j][i] = null;
            }
        }
    }

    //public void 

    private void reverseRenderList(){}
}
