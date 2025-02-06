package tovernaar123.nerfpotionspell.mixin;
import at.petrak.hexcasting.api.casting.eval.CastingEnvironment;
import at.petrak.hexcasting.api.casting.iota.Iota;
import at.petrak.hexcasting.api.casting.mishaps.MishapInvalidPattern;
import net.walksantor.hextweaks.casting.actions.OpEgyptianPlagues;
import net.walksantor.hextweaks.casting.actions.VariableMediaAction;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tovernaar123.nerfpotionspell.NerfPotionSpell;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import at.petrak.hexcasting.api.casting.mishaps.MishapInvalidIota;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
@Mixin(value = OpEgyptianPlagues.class, remap = false)
public abstract class SpellMixin {

    @Inject(
            method = "render(Ljava/util/List;Lat/petrak/hexcasting/api/casting/eval/CastingEnvironment;)Lnet/walksantor/hextweaks/casting/actions/VariableMediaAction$VariableMediaActionResult;",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onRenderHead(
            List<Iota> args,
            CastingEnvironment env,
            CallbackInfoReturnable<VariableMediaAction.VariableMediaActionResult> cir
    ) throws MishapInvalidPattern {
        throw new MishapInvalidPattern();
    }
}
