package Calculator;

public enum Rimm2 {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private int translation;

    Rimm2(int translation) {
        this.translation = translation;
    }

    public int getTranslation() {
        return translation;
    }
}
