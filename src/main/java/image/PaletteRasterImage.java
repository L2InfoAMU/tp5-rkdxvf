package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {

    int width;
    int height;
    int [][] indexOfColors;
    List<Color> palette;


    public PaletteRasterImage(Color color, int width, int height) {

       super(color,width,height);

    }

    public PaletteRasterImage(Color[][] pixels) {
       super(pixels);
    }


    public void createRepresentation() {
        this.palette = new ArrayList<>();
       this.indexOfColors = new int[getHeight()][getWidth()];

    }

    public void setPixelColor(Color color, int x, int y) {
        if(!palette.contains(color)) palette.add(color);
        this.indexOfColors[x][y]=palette.indexOf(color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                if(!palette.contains(pixels[i][j])) palette.add(pixels[i][j]);
                indexOfColors[i][j] = palette.indexOf(pixels[i][j]);

            }

        }
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
