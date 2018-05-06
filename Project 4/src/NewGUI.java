import java.awt.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class NewGUI extends JFrame {
		/**
		 * Fields for the new gui
		 */
		private int length,width,height;
		private TextArea sorted;
		
		/*
		 * Constructor for the new gui
		 * @param length requested
		 * @param width requested
		 * @param height requested
		 */
		public NewGUI(int length, int width, int height) {
			this.length=length;
			this.width=width;
			this.height=height;
			setTitle("Results for Boxes with L:"+length+" W:"+width+" H:"+height);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,400);
			initialize();
			Results();
			setVisible(true);
		}
		/*
		 * initilializes the new gui
		 */
		private void initialize() {
			setLayout(new GridLayout(1,1));
			sorted = new TextArea("Boxes:\n");
			add(sorted);
		}
		/*
		 * A helper function that displays all the boxes
		 */
		private void Results() {
			for(Box b: BoxGUI.sortedList.keySet()) {
				if(b.getL()>=length && b.getW()>=width && b.getH()>=height) {
					sorted.append(b.toString()+"\n");
				}
			}
		}
	}