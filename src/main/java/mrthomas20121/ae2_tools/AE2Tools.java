package mrthomas20121.ae2_tools;

import mrthomas20121.ae2_tools.data.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaBlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(AE2Tools.MOD_ID)
public class AE2Tools {

	public static final String MOD_ID = "ae2_tools";
	public static final Logger LOGGER = LogManager.getLogger();

	public AE2Tools() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		AE2ToolsItems.ITEMS.register(bus);

		bus.addListener(this::registerTab);
		bus.addListener(EventPriority.HIGHEST, this::addDatagen);
	}

	public void addDatagen(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		PackOutput packOutput = dataGenerator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		dataGenerator.addProvider(event.includeClient(), new AE2ToolsItemModelProvider(packOutput, existingFileHelper));
		dataGenerator.addProvider(event.includeClient(), new AE2ToolsLangProvider(packOutput));

		dataGenerator.addProvider(event.includeServer(), new AE2ToolsRecipeProvider(packOutput));
		AE2ToolsBlockTagsProvider blockTagsProvider = new AE2ToolsBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
		dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
		dataGenerator.addProvider(event.includeServer(), new AE2ToolsItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
	}

	public void registerTab(BuildCreativeModeTabContentsEvent event) {

		if(event.getTabKey().location().getPath().equals("tools_complement")) {

			event.accept(AE2ToolsItems.NETHER_QUARTZ_EXCAVATOR);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_HAMMER);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_SICKLE);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_KNIFE);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_HELMET);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_CHESTPLATE);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_LEGGINGS);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_BOOTS);

			event.accept(AE2ToolsItems.CERTUS_QUARTZ_EXCAVATOR);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_HAMMER);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_SICKLE);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_KNIFE);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_HELMET);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_CHESTPLATE);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_LEGGINGS);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_BOOTS);

			event.accept(AE2ToolsItems.FLUIX_EXCAVATOR);
			event.accept(AE2ToolsItems.FLUIX_HAMMER);
			event.accept(AE2ToolsItems.FLUIX_SICKLE);
			event.accept(AE2ToolsItems.FLUIX_KNIFE);
			event.accept(AE2ToolsItems.FLUIX_HELMET);
			event.accept(AE2ToolsItems.FLUIX_CHESTPLATE);
			event.accept(AE2ToolsItems.FLUIX_LEGGINGS);
			event.accept(AE2ToolsItems.FLUIX_BOOTS);
		}

	}
}
