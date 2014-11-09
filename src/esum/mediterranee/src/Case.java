package esum.mediterranee.src;

import java.util.ArrayList;

public class Case
{
	/** Identifiant associ� � la case */
	private int id;

	/** Identifiant associ� � la ville de la case */
	private int villeId;

	/** Cases adjacentes � la case */
	private ArrayList<Integer> casesAdjacentes = new ArrayList<Integer>();

	/** Galeres sur la case */
	private ArrayList<Galere> galeres = new ArrayList<Galere>();

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

	/** Renvoie l'identifiant de la ville sur la case */
	public int getVilleId()
	{
		return this.getVilleId();
	}

	/** Renvoie true si les cases sont adjacentes */
	public boolean estAdjacenteA(int caseId)
	{
		return this.casesAdjacentes.contains((Integer)caseId);
	}

	/** Ajoute une gal�re sur la case */
	public boolean ajouterGalere(Galere galere)
	{
		return this.galeres.add(galere);
	}

	/** Enl�ve un gal�re de la case */
	public boolean enleverGalere(Galere galere)
	{
		return this.galeres.remove(galere);
	}
}
