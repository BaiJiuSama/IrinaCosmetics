package cn.sakura.irinacosmetics.cosmetics.impl.death;

import cn.sakura.irinacosmetics.cosmetics.AbstractEffect;
import cn.sakura.irinacosmetics.cosmetics.EffectType;
import cn.sakura.irinacosmetics.util.CC;
import cn.sakura.irinacosmetics.util.ItemUtil;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestDeathEffect extends AbstractEffect {

    @Override
    public String getDisplayName() {
        return "TestEffect";
    }

    @Override
    public String getEffectInternalName() {
        return "testDeathEffect";
    }

    @Override
    public EffectType getEffectType() {
        return EffectType.DEATH;
    }

    @Override
    public ItemStack getIcon() {
        return new ItemUtil(Material.BOW).shiny().build();
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public void handleShoot(Player shooter, Arrow arrow) {

    }

    @Override
    public void handleDeath(Player myself) {
        myself.playSound(myself.getLocation(), Sound.WOLF_DEATH, 3F, 1F);
        CC.broadcast(myself.getDisplayName() + " 已经趋势了");
    }

    @Override
    public void handleKill(Player target) {

    }
}
