package turnbasedstrategy;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eih5176
 */
public class BufferedImageLoader {
    
    public BufferedImage loadImage(String pathRelativeToThis) throws IOException
    {
        URL url = this.getClass().getResource(pathRelativeToThis);
        BufferedImage img = ImageIO.read(url);
        return img;
    }
    
}
