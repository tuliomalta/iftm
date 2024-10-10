public class EquacaoSegundoGrau {
    public double a, b, c;

    public EquacaoSegundoGrau(double x, double y, double z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public double delta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double x1() {
        return (-this.b + Math.sqrt(this.delta())) / (2 * this.a);
    }

    public double x2() {
        return (-this.b - Math.sqrt(this.delta())) / (2 * this.a);
    }
}

