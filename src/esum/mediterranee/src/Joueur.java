package esum.mediterranee.src;

import java.util.ArrayList;

public class Joueur
{
	/** La civilisation du joueur */
	private final EnumCivilisation civilisation;

	/** Le nom du joueur */
	private final String nom;

	/** Joueurs */
	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

	Joueur(String nom, EnumCivilisation civilisation)
	{
		this.nom = nom;
		this.civilisation = civilisation;
	}

	/** Ajoute un joueur */
	public boolean ajouterJoueur(Joueur joueur)
	{
		String nom = joueur.getNom();
		boolean nameUsed = false;
		for(Joueur j : this.joueurs)
			nameUsed = j.getNom() == nom || nameUsed;
		return (this.joueurs.size() <= 4 && !nameUsed) ? this.joueurs.add(joueur) == true : false;
	}

	/** Supprime un joueur */
	public boolean enleverJoueur(String nom)
	{
		boolean r = false;
		for(Joueur joueur : this.joueurs)
			r = (joueur.getNom() == nom ? this.joueurs.remove(joueur) : false) || r;
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
}
