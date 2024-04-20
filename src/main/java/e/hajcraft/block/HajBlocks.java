package e.hajcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import e.hajcraft.*;

public class HajBlocks {
	public static final Identifier BLAHAJ_ID = new Identifier(Hajcraft.MOD_ID, "blue_shark1");

	public static Block BLAHAJ_BLOCK;
	public static Item BLAHAJ_ITEM;

	public static void register() {
		BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, BLAHAJ_ID, new CuddlyBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

		BLAHAJ_ITEM = Registry.register(Registries.ITEM, BLAHAJ_ID, new CuddlyItem(BLAHAJ_BLOCK, new Item.Settings().maxCount(1), null));
    }
}

