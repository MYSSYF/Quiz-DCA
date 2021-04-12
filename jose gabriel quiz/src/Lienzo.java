import java.util.ArrayList;
import construc.Figura;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class Lienzo extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Lienzo");
	}

	@Override
	public void settings() {
		size(1000, 800);

	}

	ArrayList<Figura> fig;

	@Override
	public void setup() {
		fig = new ArrayList<Figura>();

	}

	@Override
	public void draw() {
		background(100);
		for (int i = 0; i < fig.size(); i++) {
			fig.get(i).pintar();
			fig.get(i).mover(fig.get(i).getDir());
		}
		rebote();
		coli();
	}

	public void creaFig() {
		fig.add(new Figura((int) random(1, 3), (int) random(100, 900), (int) random(100, 700), (int) random(30, 300),
				(int) random(1, 3), (int) random(1, 20), this));

	}

	private void coli() {
		for (int i = 0; i < fig.size(); i++) {
			if (fig.get(i).posX  >= fig.get(i).posX -20&& fig.get(i).posX  <= fig.get(i).posX+20
					&& fig.get(i).posY  >= fig.get(i).posY-20 && fig.get(i).posY <= fig.get(i).posY+20) {
				System.out.println("d");
			}
		}
	}

	private void rebote() {
		for (int i = 0; i < fig.size(); i++) {
			if (fig.get(i).posX >= 1000) {
				fig.get(i).setDir(3);
			}
			if (fig.get(i).posY >= 800) {
				fig.get(i).setDir(4);
			}
			if (fig.get(i).posX <= 0) {
				fig.get(i).setDir(1);
			}
			if (fig.get(i).posY <= 0) {
				fig.get(i).setDir(2);
			}
		}
	}

	public void mousePressed(MouseEvent event) {
		if (mouseButton == LEFT) {

		}
		if (mouseButton == RIGHT) {
			creaFig();
		}
	}
}
