package drag0n1zed.biologic;

import drag0n1zed.biologic.block.ModBlocks;
import drag0n1zed.biologic.item.ModItemGroups;
import drag0n1zed.biologic.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BioLogic implements ModInitializer {
	public static final String MOD_ID = "biologic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}