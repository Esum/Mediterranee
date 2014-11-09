package esum.mediterranee.src;

public class Nom
{
	/** Renvoie le nom de la civilisation */
	public String nom(EnumCivilisation civilisation)
	{
		if (civilisation.getId() == EnumCivilisation.VENITIEN.getId())
			return "Venitien";
		if (civilisation.getId() == EnumCivilisation.GENOIS.getId())
			return "Gênois";
		if (civilisation.getId() == EnumCivilisation.ESPAGNOL.getId())
			return "Espagnol";
		if (civilisation.getId() == EnumCivilisation.TURC.getId())
			return "Turc";
		return "Aucune";
	}

	/** Renvoie le nom de la marchandise */
	public String nom(EnumMarchandise marchandiseType)
	{
		if (marchandiseType.getId() == EnumMarchandise.PIERRESPRECIEUSES.getId())
			return "Pierres précieuses";
		if (marchandiseType.getId() == EnumMarchandise.OR.getId())
			return "Or";
		if (marchandiseType.getId() == EnumMarchandise.EPICES.getId())
			return "Épices";
		if (marchandiseType.getId() == EnumMarchandise.VIN.getId())
			return "Vin";
		if (marchandiseType.getId() == EnumMarchandise.FER.getId())
			return "Fer";
		if (marchandiseType.getId() == EnumMarchandise.TISSUS.getId())
			return "Tissus";
		if (marchandiseType.getId() == EnumMarchandise.BOIS.getId())
			return "Bois";
		return "Aucune";
	}
}
