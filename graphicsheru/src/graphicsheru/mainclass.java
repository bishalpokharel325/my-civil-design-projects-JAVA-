package graphicsheru;
import javax.swing.JFrame;

public class mainclass {
	public static void main(String[] args){
	JFrame f=new JFrame("graphicsheru");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	shapes s=new shapes();
	f.add(s);
	f.setSize(800,800);
	f.setVisible(true);
	

}
}