package sgale.mcofthelamb.registry;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sgale.mcofthelamb.MCoftheLamb;

public class LambItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCoftheLamb.MODID);

    public static final RegistryObject<Item> CRUSADERS_BLADE = ITEMS.register("crusaders_blade", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().durability(400)));

    public static final RegistryObject<Item> APOSTATES_CLEAVER = ITEMS.register("apostates_cleaver", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().durability(400)));

    public static final RegistryObject<Item> TRAITORS_RAZOR = ITEMS.register("traitors_razor", () -> new SwordItem(Tiers.IRON, 0, -1.7F, new Item.Properties().durability(300)));

    public static final RegistryObject<Item> TEMPESTS_GAUNTLETS = ITEMS.register("tempests_gauntlets", () -> new SwordItem(Tiers.IRON, 2, -2, new Item.Properties().durability(300)));

    public static final RegistryObject<Item> WARMAKERS_HAMMER = ITEMS.register("warmakers_hammer", () -> new SwordItem(Tiers.IRON, 9, -3.5F, new Item.Properties().durability(600)));
}
