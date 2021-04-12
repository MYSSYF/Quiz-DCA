package construc;

import processing.core.PApplet;

public class triangle extends Figura {

	public triangle(int typo, int posX, int posY, int tam, int dir, int val, PApplet app) {
		super(typo, posX, posY, tam, dir, val, app);
		// TODO Auto-generated constructor stub
	}
	
@Override
public void pintar(int typo, int posX, int posY, int tam, int dir, int val) {
	// TODO Auto-generated method stub
	super.pintar(typo, posX, posY, tam, dir, val);
	app.triangle(posX, posY-tam, posX+tam, posY+tam, posX-tam, posY-tam);
}
}
