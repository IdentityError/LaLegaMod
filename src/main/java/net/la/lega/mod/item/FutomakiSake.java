package net.la.lega.mod.item;

import net.la.lega.mod.loader.LLoader;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class FutomakiSake extends Item
{
    public static final Identifier ID = new Identifier(LLoader.MOD_ID, "futomaki_sake");
    
    public static final float saturation = 2.85F;
    public static final int hunger = 8;
    
    public FutomakiSake()
    {
        super(new Item.Settings().group(ItemGroup.FOOD)
              .food(new FoodComponent.Builder()
                    .hunger(hunger)
                    .saturationModifier(saturation)
                    .alwaysEdible()
                    .build())
        );
    }
}