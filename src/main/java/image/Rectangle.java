package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape{
    Color color;
    int x,y,width,height;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color= color;

    }

    public boolean contains(Point point){
        return this.x<point.x && point.x<=this.x+width && this.y< point.y && point.y<= this.y +height;
    }

    public Color getColor(){
        return  this.color;

    }

}
