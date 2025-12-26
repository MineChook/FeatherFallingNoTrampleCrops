package site.minechook.featherfallingnotramplecrops.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FarmlandBlock.class)
abstract class FarmlandBlockMixin {

    @Inject(method = "onLandedUpon", at = @At("HEAD"), cancellable = true)
    private void onJump(World world, BlockState state, BlockPos pos, Entity entity, double fallDistance, CallbackInfo ci) {

        if (!(entity instanceof PlayerEntity player)) {
            return;
        }
        ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);
        if (boots.isEmpty()) {
            return;
        }

        if (boots.getEnchantments().toString().contains("feather_falling")) {
            ci.cancel();
        }
    }
}
