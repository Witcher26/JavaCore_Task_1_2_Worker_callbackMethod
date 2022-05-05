package interfaces;

@FunctionalInterface
public interface OnTaskErrorListener {
    public void onError(String err);
}
