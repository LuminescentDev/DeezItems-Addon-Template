package your.groupid.deezitemsexampleaddon;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.akiradev.deezitems.DeezItems;
import xyz.akiradev.deezitems.utils.ItemRarity;
import your.groupid.deezitemsexampleaddon.items.ExampleItem;

public final class DeezItemsAddonTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerItems();
        registerCustomRaritys();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerItems(){
        // Register items here
        DeezItems.registerItem("example_item", new ExampleItem());
    }

    public void registerCustomRaritys(){
        // Register custom raritys here
        ItemRarity.Raritys.put("Example_Rarity", "#0017ff");
    }

}
