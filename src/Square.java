import java.util.Collections;

public class Square extends Shape {

    public Square(String name, int x, int y, int length) {
        super(name, x, y, length);
    }

    @Override
    public void setCoordinates() {
        Center center = this.getCenter();
        int length = this.getLength();

        int a = center.getX() - length/2;
        int b = center.getY() - length/2;
        this.addCoordinates(a,b);

        int c = center.getX() + length/2;
        int d = center.getY() - length/2;
        this.addCoordinates(c,d);

        int e = center.getX() + length/2;
        int f = center.getY() + length/2;
        this.addCoordinates(e,f);

        int g = center.getX() - length/2;
        int h = center.getY() + length/2;
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
