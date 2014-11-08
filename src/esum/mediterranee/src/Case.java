package esum.mediterranee.src;

import java.util.ArrayList;

public class Case
{
	private int id;
	private int villeId;
	private ArrayList<Integer> casesAdjacentes = new ArrayList<Integer>();
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
