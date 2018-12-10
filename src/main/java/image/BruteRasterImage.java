package image;
//test
import image.Image;
        import javafx.scene.paint.Color;
        import util.Matrices;

public class BruteRasterImage extends RasterImage {

    // VARIABLES
    Color[][] colors;
    Color color;


    // COINSTRUCTEURS
    public BruteRasterImage(Color color, int width, int height) {
        super(color,width,height);
    }

    public BruteRasterImage(Color[][] colors){
        super(colors);
    }

    // METHODES
    public void createRepresentation(){
        this.colors = new Color[this.width][this.height];
    }


    public void setPixelColor(Color color, int x, int y){
        this.color = colors[x][y];
    }


    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }
}