package esum.mediterranee.src;

public class Marchandise extends Pion
{
	/** Type de la marchandise */
	private EnumMarchandise type;

	Marchandise(EnumMarchandise type, EnumCivilisation civilisation)
	{
		super(civilisation);
		this.type = type;
	}
}
