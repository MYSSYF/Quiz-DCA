package construc;

import processing.core.PApplet;
import processing.core.PConstants;

public class Figura {

	public int typo;
	public int posX;
	public int posY;
	public int tam;
	public int dir;
	public int val;
	public PApplet app;

	public Figura(int typo, int posX, int posY, int tam, int dir, int val, PApplet app) {
		this.typo = typo;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.dir = dir;
		this.val = val;
		this.app = app;

	}

	public void pintar() {
		app.rectMode(PConstants.CENTER);
		app.fill(255);

		switch (typo) {
		case 1:
			app.rect(posX, posY, tam, tam);
			break;
		case 2:
			app.circle(posX, posY, tam);
			break;
		case 3:
			app.triangle(posX, posY + tam, posX + tam, posY - tam, posX - tam, posY - tam);
			break;

		default:
			break;
		}
		app.fill(0);
		app.textAlign(PConstants.CENTER);
		app.textSize(tam - tam / 2);
		app.text(val, posX, posY);

	}

	public void mover(int dir) {
		switch (dir) {
		case 0:

			break;
		case 1:
			posX+=10;
	
			break;

		case 2:
			posY+=10;

			break;

		case 3:
		posX-=10;
		
			break;
		case 4:
			posY-=10;
			break;

		default:
			break;
		}
	}

	public int getDir() {
		return dir;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getTam() {
		return tam;
	}

	public int getTypo() {
		return typo;
	}

	public int getVal() {
		return val;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

}
