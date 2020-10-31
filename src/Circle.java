import java.util.Collections;

public class Circle extends Shape {

    public Circle(String name, int x, int y, int length) {
        super(name, x, y, length);
    }

    @Override
    public void setCoordinates() {

        Center center = this.getCenter();
        int radius = this.getLength();

        int a = center.getX() + radius;
        int b = center.getY();
        this.addCoordinates(a,b);

        int c = center.getX();
        int d = center.getY() + radius;
        this.addCoordinates(c,d);
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
