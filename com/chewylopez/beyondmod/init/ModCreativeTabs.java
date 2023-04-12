package com.chewylopez.beyondmod.init;

import com.chewylopez.beyondmod.objects.creative_tabs.ModArmorGroup;
import com.chewylopez.beyondmod.objects.creative_tabs.ModItemGroup;
import com.chewylopez.beyondmod.objects.creative_tabs.ModToolGroup;

public class ModCreativeTabs {

	public static ModItemGroup ItemTab = new ModItemGroup(net.minecraft.item.ItemGroup.GROUPS.length, "moditemtab");
	public static ModToolGroup ToolTab = new ModToolGroup(net.minecraft.item.ItemGroup.GROUPS.length, "modtooltab");
	public static ModArmorGroup ArmorTab = new ModArmorGroup(net.minecraft.item.ItemGroup.GROUPS.length, "modarmortab");
	
}
