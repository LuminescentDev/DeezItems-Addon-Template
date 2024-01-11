package your.groupid.deezitemsexampleaddon.items;

import dev.luminescent.deezitems.DeezItems;
import dev.luminescent.deezitems.manager.MaterialManager;
import dev.luminescent.deezitems.utils.DeezItem;
import dev.luminescent.deezitems.utils.ItemAbility;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleItem extends DeezItem {

    public static final ItemAbility EXAMPLE_ABILITY = new ItemAbility("example_ability", "Example ability", "Example Ability Description", ItemAbility.AbilityTypes.LEFT_CLICK, 30);

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
    public void registerRecipe() {
        NamespacedKey key = new NamespacedKey(DeezItems.getInstance(), getID());

        ShapedRecipe recipe = new ShapedRecipe(key, generate(1));

        recipe.shape(" N ", " N ", " N ");

        recipe.setIngredient('N', new RecipeChoice.ExactChoice(DeezItems.getInstance().getManager(MaterialManager.class).getMaterial("example_material").generate(1)));

        Bukkit.addRecipe(recipe);
    }
}
