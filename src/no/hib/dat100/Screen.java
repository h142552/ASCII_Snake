package no.hib.dat100;

import java.io.IOException;
import java.util.HashMap;

public class Screen {
    //private HashMap<Position, Object> renderList;
    private RenderObject[][] rl; // sorted array
    private int height;
    private int width;

    public Screen(int height, int width) {
        this.height = height;
        this.width = width;

        this.initList();
    }

    public void Render(){
        for(int i = 0; i < this.height; i++) {          // i = y
            for(int j = 0; j < this.width; j++) {       // j = x
                //Object o = renderList.get(new Position(j, i));
                Object o = rl[j][i].getObj();
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
            //e.printStackTrace();
	//} 
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void Add(Position pos, Object obj) {
        //this.renderList.put(pos, obj);
        this.rl[pos.getX()][pos.getY()] = new RenderObject(pos, obj);
        //this.renderList.replace(pos, obj);
    }

    public void Delete() {}

    public void initList() { // Needs to have all positions
        //this.renderList = new HashMap<Position, Object>();
        this.rl = new RenderObject[this.width][this.height];
        for(int i = 0; i < this.height; i++) {       // i = y
            for(int j = 0; j < this.width; j++) {    // j = x
                //this.renderList.put(new Position(j, i), null);
                this.rl[j][i] = new RenderObject(new Position(j, i), null);
            }
        }
    }

    private void reverseRenderList(){}
}
