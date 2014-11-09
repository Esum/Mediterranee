package esum.mediterranee.src;

import java.util.ArrayList;

public class Joueur
{
	/** Civilisation du joueur */
	private EnumCivilisation civilisation;

	/** Nom du joueur */
	private String nom;

	/** Liste des joueurs */
	private static ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

	Joueur(String nom, EnumCivilisation civilisation)
	{
		this.nom = nom;
		this.civilisation = civilisation;
	}

	/** Ajoute un joueur */
	public static boolean ajouterJoueur(Joueur joueur)
	{
		String nom = joueur.getNom();
		boolean nameUsed = false;
		for(Joueur j : joueurs)
			nameUsed = j.getNom() == nom || nameUsed;
		return (joueurs.size() <= 4 && !nameUsed) ? joueurs.add(joueur) == true : false;
	}

	/** Supprime un joueur */
	public static boolean enleverJoueur(String nom)
	{
		boolean r = false;
		for(Joueur joueur : joueurs)
			r = (joueur.getNom() == nom ? joueurs.remove(joueur) : false) || r;
		return r;
	}

	/** Renvoie le joueur à l'index spécifié */
	public static Joueur getJoueur(int index)
	{
		return joueurs.get(index);
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
}
