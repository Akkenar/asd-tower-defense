package models.terrains;

import java.awt.Color;
import java.awt.Rectangle;

import models.tours.Tour;
import models.tours.TourDeFeu;

public class TerrainDesert extends Terrain
{
	public TerrainDesert()
	{
		super(500, 500, "img/cartes/desert.png", 
			  new Rectangle(480,20,20,80),
			  new Rectangle(0,400,20,80));
		
		// tour du terrain
		ajouterMur(new Rectangle(0,0,20,380)); 		// gauche
		ajouterMur(new Rectangle(0,0,500,20)); 		// haut
		ajouterMur(new Rectangle(0,480,500,20)); 	// bas
		ajouterMur(new Rectangle(480,120,20,380)); 	// droit
		
		// les coins
		// haut - gauche
		ajouterMur(new Rectangle(120,120,60,20));
		ajouterMur(new Rectangle(120,120,20,60));
		
		// haut - droite
		ajouterMur(new Rectangle(320,120,60,20));
		ajouterMur(new Rectangle(360,120,20,60));
		
		// bas - gauche
		ajouterMur(new Rectangle(120,320,20,60));
		ajouterMur(new Rectangle(120,360,60,20));
		
		// bas - droite
		ajouterMur(new Rectangle(360,320,20,60));
		ajouterMur(new Rectangle(320,360,60,20));
		
	}
	
}