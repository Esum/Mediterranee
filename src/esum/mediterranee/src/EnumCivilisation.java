package esum.mediterranee.src;

import java.util.ArrayList;

public enum EnumCivilisation
{
	AUCUN (-1),
	VENITIEN (0),
	GENOIS (1),
	ESPAGNOL (2),
	TURC (3);

	/** Identifiant associé à la civilisation */
	private int id;

	private EnumCivilisation(int id)
	{
		this.id = id;
	}

	/** Renvoie l'identifiant associé à la civilisation */
	public int getId()
	{
		return this.id;
	}
}
