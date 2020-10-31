import java.util.Collections;

public class Triangle extends Shape {

    public Triangle(String name, int x, int y, int length) {
        super(name, x, y, length);
    }

    @Override
    public void setCoordinates() {
        Center center = this.getCenter();
        int length = this.getLength();
        int h = (int)(Math.sqrt(3)/2)*length;

        int a = center.getX() - length/2;
        int b = center.getY() - h/3;
        this.addCoordinates(a,b);

        int c = center.getX() + length/2;
        int d = center.getY() - h/3;
        this.addCoordinates(c,d);

        int e = center.getX();
        int f = center.getY() + 2*(h/3);
        this.addCoordinates(e,f);
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
