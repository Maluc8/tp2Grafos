package ar.edu.uno.practicas;

import java.util.*;

public class Grafo {
	boolean matrizAdyacencia[][];
	public Grafo (int dimension, double probabilidad){
		matrizAdyacencia= new boolean[dimension][dimension];
		Random r= new Random();
		for (int i=0; i<dimension; i++){
			matrizAdyacencia[i][i]=false;
			for (int j=i+1; j<dimension; j++){
				if (r.nextInt()>probabilidad){
					matrizAdyacencia[i][j]=true;
					matrizAdyacencia[j][i]=true;
				}
				else{
					matrizAdyacencia[i][j]=false;
					matrizAdyacencia[j][i]=false;
				}
			}
		}
	}
	
	public Grafo (int dimension, int porcentaje){
		matrizAdyacencia= new boolean[dimension][dimension];
		int aristas= 0;
		Random r = new Random();
		for (int i= dimension - 1; i > 0; i--){
			aristas += dimension;
		}
		aristas= aristas * dimension / 100;
		
	}
	
}
