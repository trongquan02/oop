package lab11.squareadapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg, double radius) {
        super(peg.getWidth());
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(2 * this.peg.getWidth() * this.peg.getWidth()) / 2;
    }
}
