package controlador;

import java.io.*;
import java.util.ArrayList;

import construc.Figura;
import processing.core.PApplet;

public class logica {
	PApplet app;
	public File inicio;
	public String[] line1;
	public ArrayList<Figura> fig;

	public logica(PApplet app) {
		this.app = app;
		inicio = new File("7init.txt");
		line1 = new String[10];
		fig = new ArrayList<Figura>();
	
		leer();
	}

	public void leer() {
		try {
			FileReader reader = new FileReader(inicio); // Se prepara para la lectura del archivo
			BufferedReader br = new BufferedReader(reader); // Se carga en el buffer para su manipulación
			String line = "";
			int posL1 = 0;
			while ((line = br.readLine()) != null) { // Se leen las lineas hasta el final del documento
				line1[posL1] = line;
				posL1++;
			}

			br.close(); // Se cierra el buffer
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		}

		// Anadir los datos de datosUno a mi arreglo
		for (int i = 0; i < line1.length; i++) {
			String[] temp = line1[i].split(","); // separar por comas
			int typo = Integer.parseInt(temp[0]);
			int posx = Integer.parseInt(temp[2]);
			int posy = Integer.parseInt(temp[4]);
			int tam = Integer.parseInt(temp[6]);
			int dir = Integer.parseInt(temp[8]);
			int val = Integer.parseInt(temp[10]);
			fig.add(new Figura(typo, posx, posy, tam, dir, val, null));

		}

	}
	
public void ponerlo() {
		
		for(int i=0;i<fig.size();i++) {
			app.fill(0);
			app.text(fig.get(i).getPosX()+"  |  "+fig.get(i).getPosY()+"  |  "+fig.get(i).getTypo()+"  |  "+fig.get(i).getDir()+"  |  "+fig.get(i).getTam()+"  |  ",100,100+(i*20));
		}
		
	}

}
