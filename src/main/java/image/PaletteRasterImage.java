package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {


    int[][] indexOfColors;
    List<Color> palette;


    public PaletteRasterImage(Color color, int width, int height) {

        super(color, width, height);

    }

    public PaletteRasterImage(Color[][] pixels) {
        super(pixels);
    }


    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexOfColors = new int[getHeight()][getWidth()];

    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        this.indexOfColors[x][y] = palette.indexOf(color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfColors[x][y]);
    }

}