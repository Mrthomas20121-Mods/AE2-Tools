package mrthomas20121.ae2_tools;

import appeng.items.tools.fluix.FluixToolType;
import appeng.items.tools.quartz.QuartzToolType;
import cofh.core.item.ExcavatorItem;
import cofh.core.item.HammerItem;
import cofh.core.item.KnifeItem;
import cofh.core.item.SickleItem;
import mrthomas20121.ae2_tools.item.FluixExcavatorItem;
import mrthomas20121.ae2_tools.item.FluixHammerItem;
import mrthomas20121.ae2_tools.item.FluixKnifeItem;
import mrthomas20121.ae2_tools.item.FluixSickleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static cofh.toolscomplement.ToolsComplement.TCOM_GROUP;

public class AE2ToolsItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AE2Tools.MOD_ID);

    public static Item.Properties properties = new Item.Properties().tab(TCOM_GROUP);

    // Certus Quartz Set
    public static RegistryObject<Item> CERTUS_QUARTZ_EXCAVATOR = ITEMS.register("certus_quartz_excavator", () -> new ExcavatorItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_HAMMER = ITEMS.register("certus_quartz_hammer", () -> new HammerItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_KNIFE = ITEMS.register("certus_quartz_knife", () -> new KnifeItem(QuartzToolType.CERTUS.getToolTier(), properties));
    public static RegistryObject<Item> CERTUS_QUARTZ_SICKLE = ITEMS.register("certus_quartz_sickle", () -> new SickleItem(QuartzToolType.CERTUS.getToolTier(), properties));

    // Fluix tools set
    public static RegistryObject<Item> FLUIX_EXCAVATOR = ITEMS.register("fluix_excavator", () -> new FluixExcavatorItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_HAMMER = ITEMS.register("fluix_hammer", () -> new FluixHammerItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_KNIFE = ITEMS.register("fluix_knife", () -> new FluixKnifeItem(FluixToolType.FLUIX.getToolTier(), properties));
    public static RegistryObject<Item> FLUIX_SICKLE = ITEMS.register("fluix_sickle", () -> new FluixSickleItem(FluixToolType.FLUIX.getToolTier(), properties));

    // Nether Quartz
    public static RegistryObject<Item> NETHER_QUARTZ_EXCAVATOR = ITEMS.register("nether_quartz_excavator", () -> new ExcavatorItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_HAMMER = ITEMS.register("nether_quartz_hammer", () -> new HammerItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_KNIFE = ITEMS.register("nether_quartz_knife", () -> new KnifeItem(QuartzToolType.NETHER.getToolTier(), properties));
    public static RegistryObject<Item> NETHER_QUARTZ_SICKLE = ITEMS.register("nether_quartz_sickle", () -> new SickleItem(QuartzToolType.NETHER.getToolTier(), properties));
}