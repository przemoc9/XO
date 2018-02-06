package sample;

public class Field {
    String sign;
    int row;
    int column;

    public Field(String sign, int row, int column) {
        this.sign = sign;
        this.row = row;
        this.column = column;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Field{" +
                "sign='" + sign + '\'' +
                ", row=" + row +
                ", column=" + column +
                '}';
    }
}
