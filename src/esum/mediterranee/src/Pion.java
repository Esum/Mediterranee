package esum.mediterranee.src;

public class Pion
{
	/** La civilisation qui contr�le le pion */
	private EnumCivilisation civilisation;

	Pion(EnumCivilisation civilisation)
	{
		this.civilisation = civilisation;
	}

	/** D�place le pion */
	public boolean deplacer(IPionConteneur from, IPionConteneur to)
	{
		return (from.contientPion(this) ? to.ajouterPion(this) : false) ? from.enleverPion(this) : false;
	}
}
