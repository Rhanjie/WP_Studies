package Lab5.Zad5_A;

import java.util.ArrayList;

public class Container extends Component {
    protected ArrayList<Component> children;

    Container() {
        children = new ArrayList<>();
    }

    public void add(Component child) {
        children.add(child);

        child.container = this;
    }
}
