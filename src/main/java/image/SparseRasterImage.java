package image;

import javafx.scene.paint.Color;

import java.util.Map;

public  class SparseRasterImage extends RasterImage {
    public  Color color;

    public SparseRasterImage(Color color, int width, int height){
        super(color,width,height);
    }

    public SparseRasterImage(Color[][] pixels){
        super(pixels);
    }

    // METHODES


    public void createRepresentation() {
       //
    }


    public void setPixelColor(Color color, int x, int y) {
        //
    }


    public Color getPixelColor(int x, int y) {
        return null;
    }



}
