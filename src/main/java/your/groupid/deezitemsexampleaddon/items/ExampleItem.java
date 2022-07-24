package your.groupid.deezitemsexampleaddon.items;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import xyz.akiradev.deezitems.utils.DeezItem;
import xyz.akiradev.deezitems.utils.ItemAbility;
import xyz.akiradev.deezitems.utils.ItemRarity;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleItem extends DeezItem {
    public ExampleItem() {
        super(
                Material.STICK,
                "Example Item",
                "Example_Rarity",
                1,
                new ArrayList<String>() {{
                    add("");
                    add("This is an example item");
                    add("It is common");
                    add("");
                    add("Right click to use");
                }},
                -1, //-1 means unlimited uses
                Arrays.asList(
                        new ItemAbility(
                                "Ability name",
                                "Ability description",
                                ItemAbility.AbilityTypes.LEFT_CLICK,
                                30 //cooldown value is optional
                        )
                ),
                -1 //-1 means no custom model

        );
    }

    @Override
    public boolean leftClickAirAction(Player player, ItemStack itemStack) {
        // enforce the 30 second cooldown
        if(ItemAbility.enforceCooldown(player, "cooldown-name", 30, itemStack, true)) return false;

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
}
