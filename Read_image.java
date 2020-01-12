import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Sample 
{
    public static void main(String[] args) 
    {
        BufferedImage image;
        int width;
        int height;
        int count=0;
        
        try
        {
          File input =  new File("C:\\Users\\Dell\\Pictures\\ScreenShots\\Barky.PNG");  //path of the image you want to read
          image = ImageIO.read(input);  //to read the image
          width = image.getWidth();
          height = image.getHeight();
          
          for(int i=0; i<width; i++)
          {
              for(int j=0; j<height; j++)
              {
                  count++;
                  Color c = new Color(image.getRGB(i, j));  //getRGB(int x, int y)
                  System.out.println("S.No: "+count+"  Red: "+c.getRed()+"  Green: "+c.getGreen()+"  Blue: "+c.getBlue());
              }
          }
        } catch (IOException ex) 
        {
            System.out.println("Error Occured in the Program is: "+ex);
        }
    }
}
