package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.ItemFood;

public class ItemCorndog extends ItemFood {

	public ItemCorndog() {
		super(8, 1.0F, true);
		setUnlocalizedName(Reference.TutorialItems.CORNDOG.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CORNDOG.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}