package mrthomas20121.ae2_tools.item;

import appeng.datagen.providers.tags.ConventionTags;
import cofh.lib.common.item.ArmorMaterialCoFH;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class AE2ArmorMaterials {

    public static ArmorMaterialCoFH CERTUS_QUARTZ = new ArmorMaterialCoFH("ae2_tools:certus_quartz", 6, new int[] {2, 5, 4, 2},
            15, SoundEvents.ARMOR_EQUIP_GOLD, 1, 0f, () -> Ingredient.of(ConventionTags.CERTUS_QUARTZ));

    public static ArmorMaterialCoFH FLUIX = new ArmorMaterialCoFH("ae2_tools:fluix", 8, new int[] {3, 6, 5, 4},
            15, SoundEvents.ARMOR_EQUIP_TURTLE, 2, 0.1f, () -> Ingredient.of(ConventionTags.FLUIX_CRYSTAL));

    public static ArmorMaterialCoFH NETHER_QUARTZ = new ArmorMaterialCoFH("ae2_tools:nether_quartz", 6, new int[] {2, 5, 4, 2},
            15, SoundEvents.ARMOR_EQUIP_GOLD, 1, 0f, () -> Ingredient.of(ConventionTags.NETHER_QUARTZ));
}
