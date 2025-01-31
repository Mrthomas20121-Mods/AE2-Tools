package mrthomas20121.ae2_tools.data;

import cofh.lib.util.DeferredRegisterCoFH;
import mrthomas20121.ae2_tools.AE2Tools;
import mrthomas20121.ae2_tools.AE2ToolsItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class AE2ToolsItemTagsProvider extends ItemTagsProvider {

    public AE2ToolsItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries, CompletableFuture<TagLookup<Block>> blockTagsProvider, ExistingFileHelper fileHelper) {
        super(packOutput, registries, blockTagsProvider, AE2Tools.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        armorTrim(AE2ToolsItems.ITEMS, "certus_quartz");
        armorTrim(AE2ToolsItems.ITEMS, "fluix");
        armorTrim(AE2ToolsItems.ITEMS, "nether_quartz");
    }

    protected void armorTrim(DeferredRegisterCoFH<Item> reg, String prefix) {

        Item helmet = reg.get(prefix + "_helmet");
        Item chestplate = reg.get(prefix + "_chestplate");
        Item leggings = reg.get(prefix + "_leggings");
        Item boots = reg.get(prefix + "_boots");

        tag(Tags.Items.ARMORS_HELMETS).add(helmet);
        tag(Tags.Items.ARMORS_CHESTPLATES).add(chestplate);
        tag(Tags.Items.ARMORS_LEGGINGS).add(leggings);
        tag(Tags.Items.ARMORS_BOOTS).add(boots);

        tag(Tags.Items.ARMORS)
                .add(
                        helmet,
                        chestplate,
                        leggings,
                        boots
                );

//        tag(ItemTags.TRIMMABLE_ARMOR)
//                .add(
//                        helmet,
//                        chestplate,
//                        leggings,
//                        boots
//                );
    }
}
