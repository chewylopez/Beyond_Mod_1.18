//package com.chewylopez.beyondmod.init;
//
//import com.chewylopez.beyondmod.BeyondMod;
//import net.minecraft.inventory.EquipmentSlotType;
//import net.minecraft.item.IArmorMaterial;
//import net.minecraft.item.Items;
//import net.minecraft.item.crafting.Ingredient;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.LazyValue;
//
//
//public enum ModArmorTiers implements IArmorMaterial{
//
//	EMERALD(BeyondMod.MOD_ID + ":emeraldarmor_1", 5, new int[] {3, 6, 7, 3}, 300, null, 5F, () -> {
//		return Ingredient.fromItems(Items.EMERALD);
//	});
//	
//	private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
//	private final String name;
//	private final int maxDamageFactor;
//	private final int[] damageReductionAmountArray;
//	private final int enchantability; 
//	private final SoundEvent soundEvent;
//	private final LazyValue<Ingredient> repairMaterial;
//	
//
//@Override
//public int getDurability(EquipmentSlotType slotIn) {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//@Override
//public int getDamageReductionAmount(EquipmentSlotType slotIn) {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//@Override
//public int getEnchantability() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//@Override
//public SoundEvent getSoundEvent() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public Ingredient getRepairMaterial() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public String getName() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public float getToughness() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//@Override
//public float func_230304_f_() {
//	// TODO Auto-generated method stub
//	return 0;
//}}
