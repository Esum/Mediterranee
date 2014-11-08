package esum.mediterranee.src;

import java.util.ArrayList;

public class Ville implements IPionConteneur
{
	/** Civilisation contrôlant la ville */
	private EnumCivilisation civilisation;

	/** Nom de la ville */
	private final String nom;

	/** Type de marchandise produit */
	private final EnumMarchandise marchandiseProduite;

	/** Marchandises dans la ville */
	private ArrayList<Marchandise> marchandises = new ArrayList<Marchandise>();

	/** Marins dans la ville */
	private ArrayList<Marin> marins = new ArrayList<Marin>(); 

	Ville(String nom, EnumMarchandise marchandiseProduite)
	{
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
