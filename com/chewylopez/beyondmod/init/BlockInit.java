package com.chewylopez.beyondmod.init;

import com.chewylopez.beyondmod.BeyondMod;
import com.chewylopez.beyondmod.objects.blocks.FallenCloud;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(BeyondMod.MOD_ID)
@Mod.EventBusSubscriber(modid = BeyondMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block fallen_cloud = null;
	
	@SubscribeEvent
	public static void regsisterBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new FallenCloud().setRegistryName("fallen_cloud"));
	}
	
	
	
	@SubscribeEvent	
	public static void regsisterItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(fallen_cloud, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("fallen_cloud"));
		
	}
}
