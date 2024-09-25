package com.aspose.slides.examples.shapes;

import com.aspose.slides.EffectType;


import java.io.IOException;

public class AnimationFloatUpDown 
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:AnimationFloatUpDown
        int type = EffectType.Descend;
        System.out.println(type == EffectType.Descend); // Should return 'true'
        System.out.println(type == EffectType.FloatDown); // Should return 'true'
        type = EffectType.FloatDown;
        System.out.println(type == EffectType.Descend); // Should return 'true'
        System.out.println(type == EffectType.FloatDown); // Should return 'true'
        type = EffectType.Ascend;
        System.out.println(type == EffectType.Ascend); // Should return 'true'
        System.out.println(type == EffectType.FloatUp); // Should return 'true'
        type = EffectType.FloatUp;
        System.out.println(type == EffectType.Ascend); // Should return 'true'
        System.out.println(type == EffectType.FloatUp); // Should return 'true'
        //ExEnd:AnimationFloatUpDown
    }
}
