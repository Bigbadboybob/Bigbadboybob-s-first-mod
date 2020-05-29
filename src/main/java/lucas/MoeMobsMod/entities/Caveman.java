package lucas.MoeMobsMod.entities;

import lucas.MoeMobsMod.lists.EntityList;
import lucas.MoeMobsMod.lists.ItemList;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Caveman extends MonsterEntity {
	@SuppressWarnings("unchecked")
	public Caveman(EntityType<? extends MonsterEntity> type, World worldIn) {
		super((EntityType<? extends MonsterEntity>) EntityList.caveman_entity, worldIn);
	}
	
	private static final ItemStack defaultHeldItem = new ItemStack(ItemList.caveman_club, 1);
	
	public ItemStack getHeldItem() {
		return defaultHeldItem;
	}
	
	
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
		this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 8.0f) );
		this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
		//this.goalSelector.addGoal(4, new Caveman.AttackGoal(this));
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2d);
	}

}
