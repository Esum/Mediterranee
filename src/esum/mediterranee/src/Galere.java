package esum.mediterranee.src;

import java.util.ArrayList;

public class Galere implements IPionConteneur
{
	/** Civilisation qui contr�le la gal�re */
	private EnumCivilisation civilisation;

	/** Identifiant de la case sur laquelle se situe la gal�re */
	private int caseId;

	/** Marchandises sur la gal�re */
	private ArrayList<Marchandise> marchandises = new ArrayList<Marchandise>();

	/** Marins sur la gal�re */
	private ArrayList<Marin> marins = new ArrayList<Marin>();

	Galere(int caseId, EnumCivilisation civilisation)
	{
		this.caseId = caseId;
		this.civilisation = civilisation;
	}

	/** D�place la gal�re vers caseDestination */
	public boolean deplacer(int caseDestination)
	{
		if (Cases.casesList[caseId].estAdjacenteA(caseDestination))
		{
			Cases.casesList[caseId].enleverGalere(this);
			Cases.casesList[caseDestination].ajouterGalere(this);
			this.caseId = caseDestination;
			return true;
		}
		return false;
	}

	@Override
	public boolean peutRecevoirPion(Pion pion)
	{
		return marchandises.size() + marins.size() <= 5;
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
