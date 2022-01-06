package Lab3.Zad3_C;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic {
    ArrayList<Graphic> childrens;

    CompoundGraphic() {
        childrens = new ArrayList<>();
    }

    public void add(Graphic children) {
        childrens.add(children);
    }

    public void remove(Graphic children) {
        childrens.remove(children);
    }

    @Override
    public void move(int x, int y) {
        for (var children : childrens) {
            children.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (var children : childrens) {
            children.draw();
        }
    }
}
