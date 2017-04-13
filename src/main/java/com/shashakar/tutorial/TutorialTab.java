package com.shashakar.tutorial;


import com.shashakar.tutorial.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs {

    public TutorialTab() {
        super("tabShashakar'sMod");
    }
    @Override
    public Item getTabIconItem() {
        return ModItems.doughnut;
    }
}