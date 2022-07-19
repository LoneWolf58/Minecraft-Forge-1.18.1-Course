package net.marshall.mccourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("coursemodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}