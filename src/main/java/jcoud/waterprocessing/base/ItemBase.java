package jcoud.waterprocessing.base;

import jcoud.waterprocessing.WaterProcessing_main;
import jcoud.waterprocessing.base.items.item_test;
import jcoud.waterprocessing.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        item_test.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        WaterProcessing_main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
