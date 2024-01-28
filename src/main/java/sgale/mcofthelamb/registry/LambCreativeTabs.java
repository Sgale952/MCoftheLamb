package sgale.mcofthelamb.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import sgale.mcofthelamb.MCoftheLamb;

public class LambCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCoftheLamb.MODID);

    public static final RegistryObject<CreativeModeTab> LAMB_TAB = CREATIVE_TAB.register("lamb_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mcofthelamb"))
            .icon(() -> LambItems.CRUSADERS_BLADE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(LambItems.CRUSADERS_BLADE.get());
                output.accept(LambItems.APOSTATES_CLEAVER.get());
                output.accept(LambItems.TRAITORS_RAZOR.get());
                output.accept(LambItems.TEMPESTS_GAUNTLETS.get());
                output.accept(LambItems.WARMAKERS_HAMMER.get());
            }).build());

}
