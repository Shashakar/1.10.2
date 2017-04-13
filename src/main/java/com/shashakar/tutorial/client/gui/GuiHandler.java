package com.shashakar.tutorial.client.gui;

import com.shashakar.tutorial.blocks.BlockFryer;
import com.shashakar.tutorial.container.ContainerFryer;
import com.shashakar.tutorial.tileentity.TileEntityFryer;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler{

    private static final int FRYER = 31;
    public static int getGuiID() {return FRYER;}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == getGuiID())
        {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);

        if (tileEntity instanceof TileEntityFryer) {

            TileEntityFryer tileInventoryFurnace = (TileEntityFryer) tileEntity;
            return new ContainerFurnace(player.inventory, tileInventoryFurnace);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);

        if (tileEntity instanceof TileEntityFryer) {

            TileEntityFryer tileInventoryFurnace = (TileEntityFryer) tileEntity;
            return new GuiFryer(player.inventory, tileInventoryFurnace);

        }

        return null;
    }
}
