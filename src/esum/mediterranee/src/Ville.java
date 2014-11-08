package esum.mediterranee.src;

import java.util.ArrayList;

public class Ville
{
	/** Civilisation contrôlant la ville */
	private EnumCivilisation civilisation;

	/** Nom de la ville */
	private final String nom;

	/** Type de marchandise produit */
	private final EnumMarchandise marchandiseProduite;

	/** Marins dans la ville */
	private ArrayList<Marin> marins = new ArrayList<Marin>(); 

	Ville(String nom, EnumMarchandise marchandiseProduite)
	{
		this.nom = nom;
		this.marchandiseProduite = marchandiseProduite;
	}
}
