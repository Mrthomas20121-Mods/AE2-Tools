package mrthomas20121.ae2_tools.data;

import mrthomas20121.ae2_tools.AE2Tools;
import mrthomas20121.ae2_tools.AE2ToolsItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class AE2ToolsLangProvider extends LanguageProvider {

    public AE2ToolsLangProvider(PackOutput output) {
        super(output, AE2Tools.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(AE2ToolsItems.CERTUS_QUARTZ_EXCAVATOR, "Certus Quartz Excavator");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_HAMMER, "Certus Quartz Hammer");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_KNIFE, "Certus Quartz Knife");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_SICKLE, "Certus Quartz Sickle");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_HELMET, "Certus Quartz Helmet");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_CHESTPLATE, "Certus Quartz Chestplate");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_LEGGINGS, "Certus Quartz Leggings");
        addItem(AE2ToolsItems.CERTUS_QUARTZ_BOOTS, "Certus Quartz Boots");

        addItem(AE2ToolsItems.FLUIX_EXCAVATOR, "Fluix Excavator");
        addItem(AE2ToolsItems.FLUIX_HAMMER, "Fluix Hammer");
        addItem(AE2ToolsItems.FLUIX_KNIFE, "Fluix Knife");
        addItem(AE2ToolsItems.FLUIX_SICKLE, "Fluix Sickle");
        addItem(AE2ToolsItems.FLUIX_HELMET, "Fluix Helmet");
        addItem(AE2ToolsItems.FLUIX_CHESTPLATE, "Fluix Chestplate");
        addItem(AE2ToolsItems.FLUIX_LEGGINGS, "Fluix Leggings");
        addItem(AE2ToolsItems.FLUIX_BOOTS, "Fluix Boots");

        addItem(AE2ToolsItems.NETHER_QUARTZ_EXCAVATOR, "Nether Quartz Excavator");
        addItem(AE2ToolsItems.NETHER_QUARTZ_HAMMER, "Nether Quartz Hammer");
        addItem(AE2ToolsItems.NETHER_QUARTZ_KNIFE, "Nether Quartz Knife");
        addItem(AE2ToolsItems.NETHER_QUARTZ_SICKLE, "Nether Quartz Sickle");
        addItem(AE2ToolsItems.NETHER_QUARTZ_HELMET, "Nether Quartz Helmet");
        addItem(AE2ToolsItems.NETHER_QUARTZ_CHESTPLATE, "Nether Quartz Chestplate");
        addItem(AE2ToolsItems.NETHER_QUARTZ_LEGGINGS, "Nether Quartz Leggings");
        addItem(AE2ToolsItems.NETHER_QUARTZ_BOOTS, "Nether Quartz Boots");
    }
}
