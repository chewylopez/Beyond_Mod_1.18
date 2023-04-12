package com.chewylopez.beyondmod.objects.items;

import java.util.List;

import com.chewylopez.beyondmod.init.ModItemTiers;
import com.chewylopez.beyondmod.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SausageSaber extends SwordItem {

//	@SuppressWarnings("deprecation")
//	private static Properties sausage_saber_properties = new Item.Properties()
//			.group(ModCreativeTabs.ToolTab)
//			.food(new Food.Builder().hunger(16).saturation(3F).effect(new EffectInstance(Effects.ABSORPTION, 3000, 3), 0.1F).build());
	
	public SausageSaber(Properties properties) {
		super(ModItemTiers.MEAT, 3, -2.4F, properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return stack.isEnchanted();
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("the all powerful"));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	
	
}
