package rogi.main.records;

import java.util.Arrays;
import java.util.List;

public class RecordPattern {
    public static void main(String[] args) {
        record Point(int x, int y){};
        List<Point> points = Arrays.asList(
                new Point(0, 0),
                new Point(0, 1),
                new Point(1, 0));

        for (Point(int x, int y) : points) {
            System.out.println(x + " " + y);
        }
    }
}
