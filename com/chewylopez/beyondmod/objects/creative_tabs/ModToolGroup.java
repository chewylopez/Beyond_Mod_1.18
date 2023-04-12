package com.chewylopez.beyondmod.objects.creative_tabs;

import com.chewylopez.beyondmod.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModToolGroup extends ItemGroup{

	public ModToolGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.sausage_saber);
	}

}
