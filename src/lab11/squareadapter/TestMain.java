package lab11.squareadapter;

public class TestMain {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));
        SquarePeg largeSquarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(largeSquarePeg, 10);
        System.out.println(hole.fits(squarePegAdapter));
    }

}
