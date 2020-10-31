import java.util.Comparator;

public class Vertex {
    private int x;
    private int y;

    public static final Comparator<Vertex> maxX = new Comparator<Vertex>() {
        @Override
        public int compare(Vertex v1, Vertex v2) {
            if (v1.getX() == v2.getX())
                return 0;
            return v1.getX() > v2.getX() ? 1 : -1;
        }
    };

    public static final Comparator<Vertex> maxY = new Comparator<Vertex>() {
        @Override
        public int compare(Vertex v1, Vertex v2) {
            if (v1.getY() == v2.getY())
                return 0;
            return v1.getY() > v2.getY() ? 1 : -1;
        }
    };

    public static final Comparator<Vertex> minX = new Comparator<Vertex>() {
        @Override
        public int compare(Vertex v1, Vertex v2) {
            if (v1.getX() == v2.getX())
                return 0;
            return v1.getX() > v2.getX() ? -1 : 1;
        }
    };

    public static final Comparator<Vertex> minY = new Comparator<Vertex>() {
        @Override
        public int compare(Vertex v1, Vertex v2) {
            if (v1.getY() == v2.getY())
                return 0;
            return v1.getY() > v2.getY() ? -1 : 1;
        }
    };

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
