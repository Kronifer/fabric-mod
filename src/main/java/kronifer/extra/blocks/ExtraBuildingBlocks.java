package kronifer.extra.blocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtraBuildingBlocks implements ModInitializer {

	public static final Item TEST_THING = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		
	Registry.register(Registry.ITEM, new Identifier("extrabuildingblocks", "test_thing"), TEST_THING);

	}
}
