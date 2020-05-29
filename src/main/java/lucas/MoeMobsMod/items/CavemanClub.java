package lucas.MoeMobsMod.items;

import lucas.MoeMobsMod.lists.SoundList;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CavemanClub extends Item{

	public CavemanClub() {
		super(new Item.Properties().group(ItemGroup.COMBAT));
	}
	
	public ActionResult<ItemStack> onItemHit(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		worldIn.playSound(playerIn, new BlockPos(playerIn), SoundList.BONK.get(), SoundCategory.HOSTILE, 1.0f, 1.0f);
		return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
	}
}
