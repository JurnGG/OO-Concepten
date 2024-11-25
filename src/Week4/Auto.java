package Week4;

public class Auto {
    private String merk;
    private String type;
    private int fiscaalVermogen;

    public Auto(String merk, String type, int fiscaalVermogen) {
        this.merk = merk;
        this.type = type;
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFiscaalVermogen() {
        return fiscaalVermogen;
    }

    public void setFiscaalVermogen(int fiscaalVermogen) {
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public double calculateTax() {
        switch (fiscaalVermogen) {
            case 1, 2, 3, 4 -> {
                return 91.68;
            }
            case 5 -> {
                return 114.84;
            }
            case 6 -> {
                return 165.96;
            }
            case 7 -> {
                return 216.84;
            }
            case 8 -> {
                return 268.20;
            }
            case 9 -> {
                return 319.44;
            }
            case 10 -> {
                return 370.08;
            }
            case 11 -> {
                return 480.36;
            }
            case 12 -> {
                return 590.52;
            }
            case 13 -> {
                return 700.44;
            }
            case 14 -> {
                return 810.72;
            }
            case 15 -> {
                return 920.88;
            }
            case 16 -> {
                return 1206.24;
            }
            case 17 -> {
                return 1491.84;
            }
            case 18 -> {
                return 1777.32;
            }
            case 19 -> {
                return 2062.20;
            }
            case 20 -> {
                return 2347.68;
            }
            default -> {
                if (fiscaalVermogen > 20) {
                    return 2347.68 + (fiscaalVermogen - 20) * 127.92;
                } else {
                    throw new IllegalArgumentException("Invalid fiscaalVermogen value: " + fiscaalVermogen);
                }
            }
        }

    }
}
