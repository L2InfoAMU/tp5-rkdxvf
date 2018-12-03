package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {
    int width;
    int height;
    int [][] indexOfColors;
    List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
               setPixelColor(color,width,height);
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels) {
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
              // Color [i][j] = pixels[i][j];
            }
        }
    }

    public void createRepresentation() {

    }

    public void setPixelColor(Color color, int x, int y) {

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
