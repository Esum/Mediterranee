package esum.mediterranee.src;

import java.util.ArrayList;

public class Ville implements IPionConteneur
{
	/** Civilisation contrôlant la ville */
	private EnumCivilisation civilisation;

	/** Identifiant associé à la ville */
	private int id;

	/** Identifiant associé à la case de la ville */
	private int caseId;

	/** Nom de la ville */
	private String nom;

	/** Type de marchandise produit */
	private EnumMarchandise marchandiseProduite;

	/** Taille de l'entrepôt */
	private int tailleEntrepot;

	/** Marchandises dans la ville */
	private ArrayList<Marchandise> marchandises = new ArrayList<Marchandise>();

	/** Marins dans la ville */
	private ArrayList<Marin> marins = new ArrayList<Marin>(); 

	/** Ville fortifiée */
	private boolean fortifiee = false;

	Ville(int id, int caseId, String nom, EnumMarchandise marchandiseProduite, int tailleEntrepot)
	{
		this.id = id;
		this.caseId = caseId;
		this.nom = nom;
		this.marchandiseProduite = marchandiseProduite;
		this.tailleEntrepot = tailleEntrepot;
	}

	public int getCaseId()
	{
		return this.caseId;
	}

	/** Enrôler des marins */
	public boolean enrolerMarin(int nombreMarin)
	{
		if(nombreMarin <= marchandises.size())
		{
			for(int i=1; i<=nombreMarin; i++)
				this.marins.add(new Marin(this.civilisation));
			return true;
		}
		return false;
	}

	/** Renvoie true si la ville est fortifiée */
	public boolean estFortifiee()
	{
		return this.fortifiee;
	}

	/** Fortifier la ville */
	public void fortifier()
	{
		this.fortifiee = true;
	}

	@Override
	public boolean peutRecevoirPion(Pion pion)
	{
		if (pion instanceof Marchandise)
			return this.marchandises.size() <= this.tailleEntrepot;
		else if(pion instanceof Marin)
			return true;
		return false;
	}

	@Override
	public boolean ajouterPion(Pion pion)
	{
		if (pion instanceof Marchandise)
			return peutRecevoirPion(pion) ? marchandises.add((Marchandise) pion) : false;
		else if(pion instanceof Marin)
			return peutRecevoirPion(pion) ? marins.add((Marin) pion) : false;
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
