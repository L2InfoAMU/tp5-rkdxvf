package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image{
  private List<Shape> shapes;
    private  int width;
    private int height ;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for(Shape c:shapes){
            if(c.contains(new Point(x,y)))
                return c.getColor();
        }
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
