package mrthomas20121.ae2_tools;

import mrthomas20121.ae2_tools.data.AE2ToolsRecipeProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
		event.getGenerator().addProvider(event.includeServer(), new AE2ToolsRecipeProvider(event.getGenerator().getPackOutput()));
	}

	public void registerTab(BuildCreativeModeTabContentsEvent event) {

		if(event.getTabKey().location().getPath().equals("tools_complement")) {

			event.accept(AE2ToolsItems.NETHER_QUARTZ_EXCAVATOR);
			event.accept(AE2ToolsItems.NETHER_QUARTZ_HAMMER);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_SICKLE);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_KNIFE);

			event.accept(AE2ToolsItems.CERTUS_QUARTZ_EXCAVATOR);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_HAMMER);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_SICKLE);
			event.accept(AE2ToolsItems.CERTUS_QUARTZ_KNIFE);

			event.accept(AE2ToolsItems.FLUIX_EXCAVATOR);
			event.accept(AE2ToolsItems.FLUIX_HAMMER);
			event.accept(AE2ToolsItems.FLUIX_SICKLE);
			event.accept(AE2ToolsItems.FLUIX_KNIFE);
		}

	}
}
