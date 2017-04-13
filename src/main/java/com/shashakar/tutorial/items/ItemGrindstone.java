package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;
import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemGrindstone extends Item {

	public ItemGrindstone() {
		
		setUnlocalizedName(Reference.TutorialItems.GRINDSTONE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.GRINDSTONE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}