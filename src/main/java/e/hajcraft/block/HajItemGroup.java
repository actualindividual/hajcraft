package e.hajcraft.block;


import e.hajcraft.Hajcraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HajItemGroup {
    public static ItemGroup HAJCRAFT_GROUP;

    public static void registerItemGroups() {
        HAJCRAFT_GROUP = FabricItemGroup.builder(new Identifier(Hajcraft.MOD_ID, "hajcraft"))
                .displayName(Text.translatable("itemgroup.hajcraft"))
                .icon(() -> new ItemStack(HajBlocks.BLAHAJ_ITEM)).build();
    }
}