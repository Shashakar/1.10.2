package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.ItemFood;

public class ItemDoughnut extends ItemFood {

	public ItemDoughnut() {
		super(2, 0.2F, false);
		setUnlocalizedName(Reference.TutorialItems.DOUGHNUT.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.DOUGHNUT.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}