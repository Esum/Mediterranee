package esum.mediterranee.src;

import java.util.ArrayList;

public class Galere implements IPionContainer
{
	/** Civilisation qui contrôle la galère */
	private EnumCivilisation civilisation;

	/** Identifiant de la case sur laquelle se situe la galère */
	private int caseId;

	/** Marchandises sur la galère */
	private ArrayList<Marchandise> marchandises = new ArrayList<Marchandise>();

	/** Marins sur la galère */
	private ArrayList<Marin> marins = new ArrayList<Marin>();

	/** Déplace la galère vers caseDestination */
	public void deplacer(int caseDestination)
	{
		if (Cases.casesList[caseId].estAdjacenteA(caseDestination))
		{
			Cases.casesList[caseId].enleverGalere(this);
			Cases.casesList[caseDestination].ajouterGalere(this);
			this.caseId = caseDestination;
		}
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
