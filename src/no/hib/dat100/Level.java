package no.hib.dat100;

public class Level {
    private int width, height;
    private String layout;

    public Level(int height, int width, String layout) {
        this.height = height;
        this.width = width;
        this.layout = layout;
    }

    // Layout example:
    // String layout = "##############################" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "#                            #" + 
    //                 "##############################";

    public void Render(Screen sc) {
        if(this.layout.length() == (this.height * this.width)) { // Dersom det er nok element
            for(int i = 0; i < this.height; i++) {
                for(int j = 0; j < this.width; j++) {
                    if(this.layout.charAt((i * this.width) + j) == '#')
                        sc.Add((Object) new Wall(j, i, '#'));
                    else // kanskje berre la ground være 'null'?
                        sc.Add(new Position(j, i), (Object) null);
                        //sc.Add(new Ground(j, i, ' ');
                }
            }
        }
    }
}
