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
	public boolean deplacer(Object from, Object to)
	{
		return (((IPionContainer) from).contientPion(this) ? ((IPionContainer) to).ajouterPion(this) : false) ? ((IPionContainer) from).enleverPion(this) : false;
	}
}
