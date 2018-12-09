package image;
import javafx.scene.paint.Color;
import util.Matrices;


public abstract class RasterImage implements Image {
    int width, height;

    public RasterImage(Color color, int width, int height) {
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);

    }

    public RasterImage(Color[][] pixels) {
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresRectangularMatrix(pixels);

        setWidth(pixels.length);
        setHeight(pixels[0].length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public abstract void createRepresentation();

    public abstract void setPixelColor(Color color, int x, int y);

    public abstract Color getPixelColor(int x, int y);

    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i <= this.width; i++) {
            for (int j = 0; j <= this.height; j++) {
                setPixelColor(pixels[i][j], i, j);
            }
        }
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i <= this.width; i++) {
            for (int j = 0; j <= this.height; j++) {
                setPixelColor(color, i, j);
            }
        }
    }


    public int getWidth() {
        return this.width;
    }


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
