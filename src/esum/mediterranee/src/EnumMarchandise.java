package esum.mediterranee.src;

public enum EnumMarchandise
{
	AUCUN (-1),
	PIERRESPRECIEUSES (0),
	OR (1),
	EPICES (2),
	VIN (3),
	FER (4),
	TISSUS (5),
	BOIS (6);

	/** L'identifiant associ� � la marchandise */
	private int id;

	private EnumMarchandise(int id)
	{
		this.id = id;
	}

	/** Renvoie l'identifiant associ� � la marchandise */
	public int getId()
	{
		return this.id;
	}
}
