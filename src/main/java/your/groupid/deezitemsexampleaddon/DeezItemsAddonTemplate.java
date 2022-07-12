package your.groupid.deezitemsexampleaddon;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.akiradev.deezitems.DeezItems;
import your.groupid.deezitemsexampleaddon.items.ExampleItem;

public final class DeezItemsAddonTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerItems();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerItems(){
        // Register items here
        DeezItems.registerItem("example_item", new ExampleItem());
    }

}
