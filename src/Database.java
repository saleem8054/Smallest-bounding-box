import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Database {

    private List<Shape> shapeList;

    public Database() {
        this.shapeList = new ArrayList<>();
    }

    public void read(String fileName) throws FileNotFoundException, InvalidInputException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
        int numOfShape = sc.nextInt();
        while (sc.hasNext()) {
            Shape shape;

            switch (sc.next()) {
                case "C":
                    shape = new Circle("C", sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "S":
                    shape = new Square("S", sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "T":
                    shape = new Triangle("T", sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "H":
                    shape = new Hexagon("H", sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                default:
                    throw new InvalidInputException();
            }
            this.shapeList.add(shape);
        }
    }

    public void report() {
        List<Integer> xMaxCoordinates = new ArrayList<>();
        List<Integer> yMaxCoordinates = new ArrayList<>();
        List<Integer> xMinCoordinates = new ArrayList<>();
        List<Integer> yMinCoordinates = new ArrayList<>();

        for (Shape shape : shapeList) {
            shape.setCoordinates();
            System.out.println(shape + " " + shape.getCoordinates());
            xMaxCoordinates.add(shape.getMaxX());
            yMaxCoordinates.add(shape.getMaxY());
            xMinCoordinates.add(shape.getMinX());
            yMinCoordinates.add(shape.getMinY());
        }

        int boxMinX = getMinCoordinates(xMinCoordinates);
        int boxMinY = getMinCoordinates(yMinCoordinates);

        int boxMaxX = getMaxCoordinates(xMaxCoordinates);
        int boxMaxY = getMaxCoordinates(yMaxCoordinates);

        System.out.println("\nBox x-axis minimum length is "+(boxMaxX -boxMinX));
        System.out.println("Box y-axis minimum length is "+(boxMaxY -boxMinY));

    }

    public int getMaxCoordinates(List<Integer> list){
        return Collections.max(list);
    }

    public int getMinCoordinates(List<Integer> list){
        return Collections.min(list);
    }

    public  List<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }
}
