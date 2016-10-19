import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEditorFrame extends JFrame{
	ImageEditorPanel panel = new ImageEditorPanel();
	public ImageEditorFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		
		setTitle("Image Editor");
		
		setDummyImage();
		
		add(panel);
		
	}
	private void setDummyImage(){
		BufferedImage bufferedImage = new BufferedImage(400,300, BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.getGraphics();
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 380, 280);
		panel.setImage(bufferedImage);
	}
}