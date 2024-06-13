package mrthomas20121.ae2_tools.data;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.datagen.providers.recipes.AE2RecipeProvider;
import appeng.datagen.providers.tags.ConventionTags;
import cofh.lib.init.data.RecipeProviderCoFH;
import cofh.lib.util.flags.TagExistsRecipeCondition;
import mrthomas20121.ae2_tools.AE2Tools;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static mrthomas20121.ae2_tools.AE2ToolsItems.ITEMS;

public class AE2ToolsRecipeProvider extends RecipeProviderCoFH {

    public static TagKey<Item> CERTUS_QUARTZ_BLOCK = ItemTags.create(new ResourceLocation("forge:storage_blocks/certus_quartz"));

    public AE2ToolsRecipeProvider(PackOutput output) {
        super(output, AE2Tools.MOD_ID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        generateExtraToolSet("nether_quartz", "quartz_crystal", ConventionTags.ALL_NETHER_QUARTZ, Tags.Items.STORAGE_BLOCKS_QUARTZ, consumer);
        generateExtraToolSet("certus_quartz", "certus_quartz_crystal", ConventionTags.ALL_CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK, consumer);
        generateFluixSet(consumer);
    }

    private void generateFluixSet(Consumer<FinishedRecipe> consumer) {
        generateFluixUpgrade(consumer, "excavator", "certus_quartz", "fluix");
        generateFluixUpgrade(consumer, "hammer", "certus_quartz", "fluix");
        generateFluixUpgrade(consumer, "sickle", "certus_quartz", "fluix");
        generateFluixUpgrade(consumer, "knife", "certus_quartz", "fluix");
    }

    private void generateFluixUpgrade(Consumer<FinishedRecipe> consumer, String part, String toolToUpgrade, String toolUpgraded) {
        var reg = ITEMS;
        fluixSmithing(consumer, reg.get(toolToUpgrade + "_"+ part), reg.get(toolUpgraded + "_"+ part));
    }

    protected static void fluixSmithing(Consumer<FinishedRecipe> consumer, Item input, Item output) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(AEItems.FLUIX_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(input), Ingredient.of(AEBlocks.FLUIX_BLOCK), RecipeCategory.TOOLS, output).unlocks("has_fluix_block", has(AEBlocks.FLUIX_BLOCK)).save(consumer, AE2Tools.MOD_ID+":"+getItemName(output));
    }

    private void generateExtraToolSet(String prefix, String itemName, TagKey<Item> tag, TagKey<Item> storage, Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_excavator"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern(" Y ")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_hammer"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern("XYX")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_sickle"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern(" X ")
                .pattern("  X")
                .pattern("#X ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_knife"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(consumer);
    }
}
