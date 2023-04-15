package mrthomas20121.ae2_tools;

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
	}
}
