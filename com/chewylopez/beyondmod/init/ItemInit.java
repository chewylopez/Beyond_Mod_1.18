package com.chewylopez.beyondmod.init;

import com.chewylopez.beyondmod.BeyondMod;
import com.chewylopez.beyondmod.objects.items.SausageSaber;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(BeyondMod.MOD_ID)
@Mod.EventBusSubscriber(modid = BeyondMod.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	
	//items
	public static final Item fire_shard = null;
	public static final Item sausage_saber = null;
	
	//tools
	public static final Item emerald_sword = null;
	public static final Item emerald_pick = null;
	public static final Item emerald_shovel = null;
	public static final Item emerald_axe = null;
	public static final Item emerald_hoe = null;
	
	//armor
	public static final Item emerald_helmet = null;
	public static final Item emerald_chestplate = null;
	public static final Item emerald_leggings = null;
	public static final Item emerald_boots = null;
	
	public static final Item sky_helmet = null;
	public static final Item sky_chestplate = null;
	public static final Item sky_leggings = null;
	public static final Item sky_boots = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		//items
		event.getRegistry().register(new Item(new Item.Properties().group(ModCreativeTabs.ItemTab)).setRegistryName("fire_shard"));
		event.getRegistry().register(new SausageSaber(new Item.Properties().group(ModCreativeTabs.ToolTab).food(new Food.Builder().hunger(16).saturation(3F).effect(new EffectInstance(Effects.ABSORPTION, 3000, 3), 0.1F).build())).setRegistryName("sausage_saber"));
		
		//tools 
		event.getRegistry().register(new SwordItem(ModItemTiers.EMERALD, 3, -2.4F, new Item.Properties().group(ModCreativeTabs.ToolTab)).setRegistryName("emerald_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTiers.EMERALD, 2, -2.8F, new Item.Properties().group(ModCreativeTabs.ToolTab)).setRegistryName("emerald_pick"));
		event.getRegistry().register(new ShovelItem(ModItemTiers.EMERALD, 1, -3.0F, new Item.Properties().group(ModCreativeTabs.ToolTab)).setRegistryName("emerald_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTiers.EMERALD, 4, -3.0F, new Item.Properties().group(ModCreativeTabs.ToolTab)).setRegistryName("emerald_axe"));
		event.getRegistry().register(new HoeItem(ModItemTiers.EMERALD, 0, -3.0F, new Item.Properties().group(ModCreativeTabs.ToolTab)).setRegistryName("emerald_hoe"));
		
		//armor 
//		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(ModCreativeTabs.ArmorTab)).setRegistryName("emerald_helmet"));
//		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(ModCreativeTabs.ArmorTab)).setRegistryName("emerald_chestplate"));
//		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(ModCreativeTabs.ArmorTab)).setRegistryName("emerald_leggings"));
//		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(ModCreativeTabs.ArmorTab)).setRegistryName("emerald_boots"));
	}
}
