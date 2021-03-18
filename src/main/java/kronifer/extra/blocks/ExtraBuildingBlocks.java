package kronifer.extra.blocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtraBuildingBlocks implements ModInitializer {

	public static final Item TEST_THING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Block QUARTZ_TILES = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0F, 8.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));

	@Override
	public void onInitialize() {
		
	Registry.register(Registry.ITEM, new Identifier("extrabuildingblocks", "test_thing"), TEST_THING);
    
    Registry.register(Registry.BLOCK, new Identifier("extrabuildingblocks", "quartz_tiles"), QUARTZ_TILES);

	}
}
