package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.ItemFood;

public class ItemPieApple extends ItemFood {

	public ItemPieApple() {
		super(4, 0.5F, false);
		setUnlocalizedName(Reference.TutorialItems.PIEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.PIEAPPLE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}