import java.util.Collections;

public class Hexagon extends Shape {

    public Hexagon(String name, int x, int y, int length) {
        super(name, x, y, length);
    }

    @Override
    public void setCoordinates() {
        Center center = this.getCenter();
        int length = this.getLength();

        int a = center.getX() - length/2;
        int b = center.getY() - (int)(Math.sqrt(3)/2)*length;
        this.addCoordinates(a,b);

        int c = center.getX() - length;
        int d = center.getY();
        this.addCoordinates(c,d);

        int e = center.getX() + length;
        int f = center.getY();
        this.addCoordinates(e,f);

        int g = center.getX() + length/2;
        int h = center.getY() + (int)(Math.sqrt(3)/2)*length;
        this.addCoordinates(g,h);
    }

    @Override
    public int getMaxX() {
        return Collections.max(this.getCoordinates(),Vertex.maxX).getX();
    }

    @Override
    public int getMaxY() {
        return Collections.max(this.getCoordinates(),Vertex.maxY).getY();
    }

    @Override
    public int getMinX() {
        return Collections.max(this.getCoordinates(),Vertex.minX).getX();
    }

    @Override
    public int getMinY() {
        return Collections.max(this.getCoordinates(),Vertex.minY).getY();
    }
}
