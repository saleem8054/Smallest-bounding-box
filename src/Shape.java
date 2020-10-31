import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private String name;
    private Center center;
    private int length;
    private List<Vertex> coordinates;

    public Shape(String name, int x, int y, int length) {
        this.name = name;
        this.center = new Center(x,y);
        this.length = length;
        this.coordinates = new ArrayList<>();
    }

    public abstract int getMaxX();
    public abstract int getMaxY();
    public abstract int getMinX();
    public abstract int getMinY();

    public abstract void setCoordinates();

    public void addCoordinates(int x,int y){
        Vertex coordinates = new Vertex(x,y);
        this.coordinates.add(coordinates);
    }

    @Override
    public String toString() {
        return this.name+this.center+" "+this.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public List<Vertex> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Vertex> coordinates) {
        this.coordinates = coordinates;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
