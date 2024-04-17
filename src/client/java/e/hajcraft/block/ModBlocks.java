package e.hajcraft.block;

import e.hajcraft.Hajcraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Hajcraft.MOD_ID, name), block);
    }
    
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Hajcraft.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        Hajcraft.LOGGER.debug("registering ModBlocks for hajcraft");
    }
}