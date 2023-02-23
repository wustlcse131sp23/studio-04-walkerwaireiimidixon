package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) throws FileNotFoundException{
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
		
	}
}