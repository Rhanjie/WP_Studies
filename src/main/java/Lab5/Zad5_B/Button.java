package Lab5.Zad5_B;

public class Button {
    private LambdaExecutor lambdaExecutor;

    public void setCommand(LambdaExecutor lambdaExecutor) {
        this.lambdaExecutor = lambdaExecutor;
    }

    public void onClick() {
        if (lambdaExecutor != null) {
            lambdaExecutor.execute();
        }
    }
}
