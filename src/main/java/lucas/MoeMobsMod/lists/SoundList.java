package lucas.MoeMobsMod.lists;

import lucas.MoeMobsMod.MainMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {
	
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, MainMod.modid);
	public static final RegistryObject<SoundEvent> BONK = SOUNDS.register("item.caveman_club.hit", () -> new SoundEvent(new ResourceLocation(MainMod.modid, "item.caveman_club.hit")));

}

