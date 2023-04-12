package com.chewylopez.beyondmod.objects.creative_tabs;

import com.chewylopez.beyondmod.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModArmorGroup extends ItemGroup{
	
	public ModArmorGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.sky_helmet);
	}

}
