package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public  class SparseRasterImage extends RasterImage {
    public  Color color;
    Map<Point,Color> pixelMap;

    public SparseRasterImage(Color color, int width, int height){

        super(color,width,height);

    }

    public SparseRasterImage(Color[][] pixels){
        super(pixels);
    }

    // METHODES


    public void createRepresentation() {
        pixelMap = new HashMap<>();
    }


    public void setPixelColor(Color color, int x, int y) {
        pixelMap.put(new Point(x,y),color);

    }


    public Color getPixelColor(int x, int y) {

        return pixelMap.getOrDefault(new Point(x,y),Color.WHITE);
    }



}
