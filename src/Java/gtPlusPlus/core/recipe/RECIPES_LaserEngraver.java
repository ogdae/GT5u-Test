package gtPlusPlus.core.recipe;

import gregtech.api.enums.*;
import gregtech.api.interfaces.IOreRecipeRegistrator;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import net.minecraft.item.ItemStack;

public class RECIPES_LaserEngraver implements IOreRecipeRegistrator {
	public RECIPES_LaserEngraver() {
		OrePrefixes.crafting.add(this);
	}

	@Override
	public void registerOre(final OrePrefixes aPrefix, final Materials aMaterial, final String aOreDictName,
			final String aModName, final ItemStack aStack) {
		if (aOreDictName.equals(OreDictNames.craftingLensBlue.toString())) {
			GT_Values.RA.addLaserEngraverRecipe(
					GT_OreDictUnificator.get(OrePrefixes.foil, Materials.YttriumBariumCuprate, 2L),
					GT_Utility.copyAmount(0L, new Object[] {
							aStack
					}), GregtechItemList.Circuit_Parts_Wiring_IV.get(1L, new Object[0]), 64, 480);
		}
		else if (aOreDictName.equals(OreDictNames.craftingLensYellow.toString())) {
			GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Osmium, 2L),
					GT_Utility.copyAmount(0L, new Object[] {
							aStack
					}), GregtechItemList.Circuit_Parts_Wiring_LuV.get(1L, new Object[0]), 64, 1024);
		}
		else if (aOreDictName.equals(OreDictNames.craftingLensCyan.toString())) {
		}
		else if (aOreDictName.equals(OreDictNames.craftingLensRed.toString())) {
		}
		else if (aOreDictName.equals(OreDictNames.craftingLensGreen.toString())) {
			GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Naquadah, 2L),
					GT_Utility.copyAmount(0L, new Object[] {
							aStack
					}), GregtechItemList.Circuit_Parts_Wiring_ZPM.get(1L, new Object[0]), 64, 2000);
		}
		else if (aOreDictName.equals(OreDictNames.craftingLensWhite.toString())) {

		}
	}
}
