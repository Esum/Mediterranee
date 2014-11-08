package esum.mediterranee.src;

public class Pion
{
	/** La civilisation qui contrôle le pion */
	private EnumCivilisation civilisation;

	Pion(EnumCivilisation civilisation)
	{
		this.civilisation = civilisation;
	}

	/** Déplace le pion */
	public boolean deplacer(Object from, Object to)
	{
		return (((IPionConteneur) from).contientPion(this) ? ((IPionConteneur) to).ajouterPion(this) : false) ? ((IPionConteneur) from).enleverPion(this) : false;
	}
}
