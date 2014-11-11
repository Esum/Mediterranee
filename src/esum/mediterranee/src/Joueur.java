package esum.mediterranee.src;

import java.util.HashMap;

public class Joueur
{
	/** Civilisation du joueur */
	private EnumCivilisation civilisation;

	/** Nom du joueur */
	private String nom;

	/** Nombre de ducats du joueur */
	private int ducats;

	/** Liste des joueurs */
	private static HashMap<Integer, Joueur> joueurs = new HashMap<Integer, Joueur>();

	Joueur(String nom, EnumCivilisation civilisation)
	{
		this.nom = nom;
		this.civilisation = civilisation;
		this.ducats = 2000;
	}

	Joueur(String nom, EnumCivilisation civilisation, int ducats)
	{
		this.nom = nom;
		this.civilisation = civilisation;
		this.ducats = ducats;
	}

	/** Renvoie le joueur à l'index spécifié */
	public static Joueur getJoueur(int index)
	{
		return joueurs.get(index);
	}

	/** Modifier un joueur */
	public static boolean setJoueur(Joueur joueur)
	{
		String nom = joueur.getNom();
		boolean nameUsed = false;
		for (int i=0; i<=joueurs.keySet().size(); i++)
			nameUsed = joueurs.get(i).getNom() == nom || nameUsed;
		if (!nameUsed)
		{
			joueurs.put(joueur.getCivilisation().getId(), joueur);
			return true;
		}
		return false;
	}

	/** Supprime le joueur avec la civilisation spécifié */
	public static boolean enleverJoueur(EnumCivilisation civilisation)
	{
		boolean r = false;
		for (int i=0; i<=joueurs.keySet().size(); i++)
			r = (joueurs.get(i).getCivilisation().getId() == civilisation.getId() ? joueurs.remove(i) instanceof Joueur : false) || r;
		return r;
	}

	/** Supprime le joueur avec le nom spécifié */
	public static boolean enleverJoueur(String nom)
	{
		boolean r = false;
		for (int i=0; i<=joueurs.keySet().size(); i++)
			r = (joueurs.get(i).getNom() == nom ? joueurs.remove(i) instanceof Joueur : false) || r;
		return r;
	}

	/** Renvoie la civilisation du joueur */
	public EnumCivilisation getCivilisation()
	{
		return this.civilisation;
	}

	/** Renvoie le nom du joueur */
	public String getNom()
	{
		return this.nom;
	}

	/** Renvoie le nombre de ducats du joueur */
	public int getDucats()
	{
		return this.ducats;
	}

	public boolean enleverDucats(int ducats)
	{
		if (this.ducats >= ducats)
		{
			this.ducats -= ducats;
			return true;
		}
		return false;
	}
}
