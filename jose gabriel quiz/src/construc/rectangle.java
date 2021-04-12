package construc;

import processing.core.PApplet;

public class rectangle extends Figura {

	public rectangle(int typo, int posX, int posY, int tam, int dir, int val, PApplet app) {
		super(typo, posX, posY, tam, dir, val, app);
		// TODO Auto-generated constructor stub
	}
	
@Override
public void pintar(int typo, int posX, int posY, int tam, int dir, int val) {
	// TODO Auto-generated method stub
	super.pintar(typo, posX, posY, tam, dir, val);
	app.rect(posX, posY, tam, tam);
}
}
