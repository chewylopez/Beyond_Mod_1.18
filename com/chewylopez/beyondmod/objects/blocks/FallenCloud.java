package com.chewylopez.beyondmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FallenCloud extends Block{
	
	private static Properties fallen_cloud_properties = Properties
			.create(Material.MISCELLANEOUS)
			.hardnessAndResistance(0.4F, 0.8F)
			.sound(SoundType.CLOTH)
			.harvestLevel(3);
	
	public FallenCloud() {
		super(fallen_cloud_properties);
	}
	
}

