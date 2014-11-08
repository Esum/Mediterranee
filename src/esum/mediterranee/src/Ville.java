package esum.mediterranee.src;

import java.util.ArrayList;

public class Ville implements IPionConteneur
{
	/** Civilisation contrôlant la ville */
	private EnumCivilisation civilisation;

	/** Identifiant associé à la ville */
	private int id;

	/** Nom de la ville */
	private String nom;

	/** Type de marchandise produit */
	private EnumMarchandise marchandiseProduite;

	/** Marchandises dans la ville */
	private ArrayList<Marchandise> marchandises = new ArrayList<Marchandise>();

	/** Marins dans la ville */
	private ArrayList<Marin> marins = new ArrayList<Marin>(); 

	Ville(int id, String nom, EnumMarchandise marchandiseProduite)
	{
		this.id = id;
		this.nom = nom;
		this.marchandiseProduite = marchandiseProduite;
	}

	@Override
	public boolean peutRecevoirPion()
	{
		return marchandises.size() + marins.size() <= 5;
	}

	@Override
	public boolean ajouterPion(Pion pion)
	{
		if (pion instanceof Marchandise)
			return peutRecevoirPion() ? marchandises.add((Marchandise) pion) : false;
		else if(pion instanceof Marin)
			return peutRecevoirPion() ? marins.add((Marin) pion) : false;
		return false;
	}

	@Override
	public boolean enleverPion(Pion pion)
	{
		if (pion instanceof Marchandise)
			return marchandises.remove((Marchandise) pion);
		else if(pion instanceof Marin)
			return marins.remove((Marin) pion);
		return false;
	}

	@Override
	public boolean contientPion(Pion pion)
	{
		if (pion instanceof Marchandise)
			return marchandises.contains((Marchandise) pion);
		else if(pion instanceof Marin)
			return marins.contains((Marin) pion);
		return false;
	}
}
