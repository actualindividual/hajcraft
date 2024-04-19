package e.hajcraft.block;

import e.hajcraft.Hajcraft;
//import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
//import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // blocks

    public static final Block BLAHAJ_BLOCK = registerBlock("blahaj", 
        new Block(FabricBlockSettings.of(Material.WOOL).strength(4.0f)));

    // block items (i see no reason for these being in a seperate class)

    public static final Item BLAHAJ_ITEM = new CuddlyItem(BLAHAJ_BLOCK, new FabricItemSettings().maxCount(1), "ikea shork");

    // not blocks or block items

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Hajcraft.MOD_ID, name), block);
    }

    // method from the kaupenjoe tutorial that doesn't work with this
    /*private static Item registerBlockItem(String name, Block block, ItemGroup tab, String tooltip) {
        Item item = CuddlyItem(block, new FabricItemSettings().maxCount(1), tooltip);
        return item;
    }*/ 

    public static void registerModBlocks() {
        Hajcraft.LOGGER.debug("registering ModBlocks for hajcraft");
    }
}