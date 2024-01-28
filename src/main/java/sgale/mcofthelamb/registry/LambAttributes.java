package sgale.mcofthelamb.registry;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sgale.mcofthelamb.MCoftheLamb;

public class LambAttributes {
    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MCoftheLamb.MODID);

    public static final RegistryObject<Attribute> ATTACK_DISTANCE = ATTRIBUTES.register("generic.attack_distance", () -> new RangedAttribute("attribute.name.generic.attack_distance", 6, 0, 20));
}
