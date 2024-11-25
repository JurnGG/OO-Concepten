package peerTutoring_week8;

public enum Smaak {
    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME, SEC, DEMI_SEC, DOUX;

    @Override
    public String toString() {
        String name = this.name().replace("_", "-").toLowerCase();
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
