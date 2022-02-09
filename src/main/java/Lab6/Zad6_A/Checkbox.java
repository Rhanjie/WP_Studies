package Lab6.Zad6_A;

public class Checkbox extends Component {
    public boolean checked = false;

    Checkbox(Mediator dialog) {
        super(dialog);
    }

    public void check() {
        checked = !checked;

        dialog.notify(this, "check");
    }
}
