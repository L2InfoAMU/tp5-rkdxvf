package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public class PaletteRasterImage implements Image {


    int width;
    int height;
    int [][] indexOfColors;
    List<Color> palette;


    public PaletteRasterImage(Color color, int width, int height) {

       setWidth(width);
       setHeight(height);
       createRepresentation();
       setPixelColor(color,width,height);

    }

    public PaletteRasterImage(Color[][] pixels) {
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresRectangularMatrix(pixels);

        setWidth(pixels.length);
        setHeight(pixels[0].length);
        createRepresentation();
        setPixelColor(pixels);
    }


    public void createRepresentation() {

    }

    public void setPixelColor(Color color, int x, int y) {
            for (int x=0;x<width;x++){
                for (int y=0;y<height;y++){
                    setPixelColor(pixels[x][y]),x,y);
                }
            }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    public void setPixelsColor(Color[][] pixels) {

    }

    private void setPixelsColor(Color color) {

    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}
