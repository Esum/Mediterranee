package esum.mediterranee.src;

public interface IPionConteneur
{
	public boolean peutRecevoirPion(Pion pion);
	public boolean ajouterPion(Pion pion);
	public boolean enleverPion(Pion pion);
	public boolean contientPion(Pion pion);
}
