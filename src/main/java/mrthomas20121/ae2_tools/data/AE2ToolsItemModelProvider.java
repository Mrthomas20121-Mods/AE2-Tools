package mrthomas20121.ae2_tools.data;

import cofh.lib.init.data.ItemModelProviderCoFH;
import cofh.lib.util.DeferredRegisterCoFH;
import mrthomas20121.ae2_tools.AE2Tools;
import mrthomas20121.ae2_tools.AE2ToolsItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class AE2ToolsItemModelProvider extends ItemModelProviderCoFH {

    protected static final List<ResourceKey<TrimMaterial>> VANILLA_TRIM_MATERIALS = List.of(TrimMaterials.QUARTZ, TrimMaterials.IRON, TrimMaterials.NETHERITE, TrimMaterials.REDSTONE, TrimMaterials.COPPER, TrimMaterials.GOLD, TrimMaterials.EMERALD, TrimMaterials.DIAMOND, TrimMaterials.LAPIS, TrimMaterials.AMETHYST);

    public AE2ToolsItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AE2Tools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheld(AE2ToolsItems.CERTUS_QUARTZ_EXCAVATOR);
        handheld(AE2ToolsItems.CERTUS_QUARTZ_HAMMER);
        handheld(AE2ToolsItems.CERTUS_QUARTZ_KNIFE);
        handheld(AE2ToolsItems.CERTUS_QUARTZ_SICKLE);

        handheld(AE2ToolsItems.FLUIX_EXCAVATOR);
        handheld(AE2ToolsItems.FLUIX_HAMMER);
        handheld(AE2ToolsItems.FLUIX_KNIFE);
        handheld(AE2ToolsItems.FLUIX_SICKLE);

        handheld(AE2ToolsItems.NETHER_QUARTZ_EXCAVATOR);
        handheld(AE2ToolsItems.NETHER_QUARTZ_HAMMER);
        handheld(AE2ToolsItems.NETHER_QUARTZ_KNIFE);
        handheld(AE2ToolsItems.NETHER_QUARTZ_SICKLE);

        armorSet(AE2ToolsItems.ITEMS, "certus_quartz");
        armorSet(AE2ToolsItems.ITEMS, "fluix");
        armorSet(AE2ToolsItems.ITEMS, "nether_quartz");
    }

    protected void armorSet(DeferredRegisterCoFH<Item> reg, String prefix) {

        helmetItem(reg.get(prefix + "_helmet"));
        chestplateItem(reg.get(prefix + "_chestplate"));
        leggingsItem(reg.get(prefix + "_leggings"));
        bootsItem(reg.get(prefix + "_boots"));
    }

    public String itemName(Item item) {
        ResourceLocation location = ForgeRegistries.ITEMS.getKey(item);
        if (location != null) {
            return location.getPath();
        } else {
            throw new IllegalStateException("Unknown item: " + item.toString());
        }
    }

    public void helmetItem(Item item) {
        this.armorItem(item, "helmet");
    }

    public void chestplateItem(Item item) {
        this.armorItem(item, "chestplate");
    }

    public void leggingsItem(Item item) {
        this.armorItem(item, "leggings");
    }

    public void bootsItem(Item item) {
        this.armorItem(item, "boots");
    }

    public void armorItem(Item item, String type) {
        ItemModelBuilder builder = this.withExistingParent(this.itemName(item), this.mcLoc("item/generated")).texture("layer0", this.modLoc("item/" + this.itemName(item)));
//        double index = 0.1;
//        for (ResourceKey<TrimMaterial> trimMaterial : VANILLA_TRIM_MATERIALS) {
//            String material = trimMaterial.location().getPath();
//            String name = this.itemName(item) + "_" + material + "_trim";
//            this.withExistingParent(name, this.mcLoc("item/generated"))
//                    .texture("layer0", this.modLoc("item/" + this.itemName(item)))
//                    .texture("layer1", this.mcLoc("trims/items/" + type + "_trim_" + material));
//            builder.override().predicate(new ResourceLocation("trim_type"), (float) index).model(this.getExistingFile(this.modLoc("item/" + name))).end();
//            index += 0.1;
//        }
    }
}
