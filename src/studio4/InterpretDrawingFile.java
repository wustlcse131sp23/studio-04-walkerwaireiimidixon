package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeTyoe = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth  = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (isFilled == false)
			{
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		else
			{
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
		
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledCircle(0.50, 0.5, 0.15);
		
		StdDraw.setPenColor(49, 73, 100);
		StdDraw.filledCircle(0.50, 0.5, 0.10);
		
		StdDraw.setPenColor(255, 165, 5);
		StdDraw.filledCircle(0.50, 0.5, 0.05);
	}
}
