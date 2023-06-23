package your.groupid.deezitemsexampleaddon.items;

import dev.luminescent.deezitems.utils.DeezItem;
import dev.luminescent.deezitems.utils.ItemAbility;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleItem extends DeezItem {

    public static final ItemAbility EXAMPLE_ABILITY = new ItemAbility("example_ability", "Example ability", ItemAbility.AbilityTypes.LEFT_CLICK, 30);

    public ExampleItem() {
        super(
                "example_item",
                Material.STICK,
                "Example Item",
                "Example_Rarity",
                new ArrayList<String>() {{
                    add("");
                    add("This is an example item");
                    add("It is common");
                    add("");
                    add("Right click to use");
                }},
                -1, //-1 means unlimited uses
                Collections.singletonList(EXAMPLE_ABILITY),
                -1 //-1 means no custom model

        );
    }

    @Override
    public boolean leftClickAirAction(Player player, ItemStack itemStack) {
        // enforce the 30-second cooldown
        if (EXAMPLE_ABILITY.enforceCooldown(player, itemStack, true)) return false;

        // do something
        player.sendMessage("You used the ability");

        //if you are using the action set to true
        return false;
    }

    @Override
    public boolean leftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean shiftleftClickAirAction(Player player, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean shiftleftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean rightClickAirAction(Player player, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean rightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean shiftrightClickAirAction(Player player, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean shiftrightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean middleClickAction(Player player, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean breakBlockAction(Player player, BlockBreakEvent blockBreakEvent, Block block, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean projectileHitAction(Player player, ProjectileHitEvent projectileHitEvent, ItemStack itemStack) {
        return false;
    }

    @Override
    public void registerRecipe() {

    }
}
