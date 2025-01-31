package mrthomas20121.ae2_tools;

import appeng.items.tools.fluix.FluixToolType;
import appeng.items.tools.quartz.QuartzToolType;
import cofh.core.common.item.*;
import cofh.lib.util.DeferredRegisterCoFH;
import mrthomas20121.ae2_tools.item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AE2ToolsItems {

    public static DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, AE2Tools.MOD_ID);

    public static Item.Properties properties = new Item.Properties();

    // Certus Quartz Set
    public static RegistryObject<Item> CERTUS_QUARTZ_EXCAVATOR = ITEMS.register("certus_quartz_excavator", () -> new ExcavatorItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_HAMMER = ITEMS.register("certus_quartz_hammer", () -> new HammerItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_KNIFE = ITEMS.register("certus_quartz_knife", () -> new KnifeItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_SICKLE = ITEMS.register("certus_quartz_sickle", () -> new SickleItem(QuartzToolType.CERTUS.getToolTier(), properties));

    public static RegistryObject<Item> CERTUS_QUARTZ_HELMET = ITEMS.register("certus_quartz_helmet", () -> new ArmorItemCoFH(AE2ArmorMaterials.CERTUS_QUARTZ, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> CERTUS_QUARTZ_CHESTPLATE = ITEMS.register("certus_quartz_chestplate", () -> new ArmorItemCoFH(AE2ArmorMaterials.CERTUS_QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> CERTUS_QUARTZ_LEGGINGS = ITEMS.register("certus_quartz_leggings", () -> new ArmorItemCoFH(AE2ArmorMaterials.CERTUS_QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> CERTUS_QUARTZ_BOOTS = ITEMS.register("certus_quartz_boots", () -> new ArmorItemCoFH(AE2ArmorMaterials.CERTUS_QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));

    // Fluix tools set
    public static RegistryObject<Item> FLUIX_EXCAVATOR = ITEMS.register("fluix_excavator", () -> new FluixExcavatorItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_HAMMER = ITEMS.register("fluix_hammer", () -> new FluixHammerItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_KNIFE = ITEMS.register("fluix_knife", () -> new FluixKnifeItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_SICKLE = ITEMS.register("fluix_sickle", () -> new FluixSickleItem(FluixToolType.FLUIX.getToolTier(), properties));

    public static RegistryObject<Item> FLUIX_HELMET = ITEMS.register("fluix_helmet", () -> new ArmorItemCoFH(AE2ArmorMaterials.FLUIX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> FLUIX_CHESTPLATE = ITEMS.register("fluix_chestplate", () -> new ArmorItemCoFH(AE2ArmorMaterials.FLUIX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> FLUIX_LEGGINGS = ITEMS.register("fluix_leggings", () -> new ArmorItemCoFH(AE2ArmorMaterials.FLUIX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> FLUIX_BOOTS = ITEMS.register("fluix_boots", () -> new ArmorItemCoFH(AE2ArmorMaterials.FLUIX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));

    // Nether Quartz
    public static RegistryObject<Item> NETHER_QUARTZ_EXCAVATOR = ITEMS.register("nether_quartz_excavator", () -> new ExcavatorItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_HAMMER = ITEMS.register("nether_quartz_hammer", () -> new HammerItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_KNIFE = ITEMS.register("nether_quartz_knife", () -> new KnifeItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_SICKLE = ITEMS.register("nether_quartz_sickle", () -> new SickleItem(QuartzToolType.NETHER.getToolTier(), properties));

    public static RegistryObject<Item> NETHER_QUARTZ_HELMET = ITEMS.register("nether_quartz_helmet", () -> new ArmorItemCoFH(AE2ArmorMaterials.NETHER_QUARTZ, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> NETHER_QUARTZ_CHESTPLATE = ITEMS.register("nether_quartz_chestplate", () -> new ArmorItemCoFH(AE2ArmorMaterials.NETHER_QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> NETHER_QUARTZ_LEGGINGS = ITEMS.register("nether_quartz_leggings", () -> new ArmorItemCoFH(AE2ArmorMaterials.NETHER_QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
    public static RegistryObject<Item> NETHER_QUARTZ_BOOTS = ITEMS.register("nether_quartz_boots", () -> new ArmorItemCoFH(AE2ArmorMaterials.NETHER_QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)).setModId(AE2Tools.MOD_ID));
}