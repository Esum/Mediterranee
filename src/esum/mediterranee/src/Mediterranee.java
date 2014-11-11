package esum.mediterranee.src;

import java.util.Scanner;

public class Mediterranee
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int nombreJoueur = 2;
		System.out.print("Nombre de joueur: ");
		try
		{
			nombreJoueur = in.nextInt();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.print(nombreJoueur);
		System.out.print("\n");
		
		Joueur.setJoueur(new Joueur("Joueur1", EnumCivilisation.VENITIEN));
		Joueur.setJoueur(new Joueur("Joueur2", EnumCivilisation.GENOIS));
		Joueur.setJoueur(new Joueur("Joueur3", EnumCivilisation.ESPAGNOL));
		Joueur.setJoueur(new Joueur("Joueur4", EnumCivilisation.TURC));

		System.out.print("\n0: Créer galère\n1: Enrôler marin\n");
		int action = -1;
		int action2 = -1;
		try
		{
			action = in.nextInt();
		} catch (Exception e) { e.printStackTrace(); }
		switch (action)
		{
			case 0:
				System.out.print("caseId: ");
				try
				{
					action2 = in.nextInt();
				} catch (Exception e) { e.printStackTrace(); }
				Cases.casesList[action2].ajouterGalere(new Galere(Cases.casesList[action2].getId(), Joueur.getJoueur(0).getCivilisation()));
		}
	}
}
