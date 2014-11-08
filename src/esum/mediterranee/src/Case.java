package esum.mediterranee.src;

import java.util.ArrayList;

public class Case
{
	/** Identifiant associé à la case */
	private int id;

	/** Identifiant associé à la ville de la case */
	private int villeId;

	/** Cases adjacentes à la case */
	private ArrayList<Integer> casesAdjacentes = new ArrayList<Integer>();

	/** Galeres sur la case */
	private ArrayList<Galere> galeres;

	Case(int id, int villeId, int[] casesAdjacentes)
	{
		this.id = id;
		this.villeId = villeId;
		for (int ville : casesAdjacentes)
			this.casesAdjacentes.add((Integer)ville);
	}

	/** Renvoie l'identifiant de la case */
	public int getId()
	{
		return this.id;
	}

	/** Renvoie true si les cases sont adjacentes */
	public boolean estAdjacenteA(int caseId)
	{
		return this.casesAdjacentes.contains((Integer)caseId);
	}

	/** Ajoute une galère */
	public boolean ajouterGalere(Galere galere)
	{
		return this.galeres.add(galere);
	}

	/** Supprime une galère */
	public boolean enleverGalere(Galere galere)
	{
		return this.galeres.remove(galere);
	}
}
