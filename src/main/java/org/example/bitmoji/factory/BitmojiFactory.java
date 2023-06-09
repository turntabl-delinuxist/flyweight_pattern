package org.example.bitmoji.factory;

import org.example.bitmoji.type.BitmojiType;
import org.example.bitmoji.type.BodyType;
import org.example.bitmoji.type.SkinColorType;

import java.util.HashMap;
import java.util.Map;

public class BitmojiFactory {
    static Map<String, BitmojiType> bitmojiTypes = new HashMap<>();

    public static BitmojiType getBitmojiType(String name, SkinColorType skinColorType, BodyType bodyType) {
        BitmojiType bitmojiType = bitmojiTypes.get(name);
        if(bitmojiType == null) {
            bitmojiType = new BitmojiType(name,bodyType,skinColorType);
            bitmojiTypes.put(name,bitmojiType);
        }
        return bitmojiType;
    }
}
