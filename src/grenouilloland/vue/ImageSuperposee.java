package grenouilloland.vue;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageSuperposee 
{
	private ImageIcon eau;
    private ImageIcon autre;

    public ImageSuperposee(ImageIcon eau, ImageIcon autre) {
        this.eau = eau;
        this.autre = autre;
    }


    public void paintImageIcon(Component c, Graphics g, int x, int y) {
        eau.paintIcon(c, g, x, y);
        autre.paintIcon(c, g, x, y);
    }
}
