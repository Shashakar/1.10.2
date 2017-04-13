package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.ItemFood;

public class ItemFillingApple extends ItemFood {

	public ItemFillingApple() {
		super(1, 0.2F, false);
		setUnlocalizedName(Reference.TutorialItems.FILLINGAPPLE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.FILLINGAPPLE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}