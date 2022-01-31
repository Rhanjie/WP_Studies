package Lab4.Zad4_C;

import java.util.ArrayList;

public class TreeFactory {
    static ArrayList<TreeType> treeTypes = new ArrayList<TreeType>();

    public static TreeType getTreeType(String name, Color color, Texture texture) {
        for (var treeType : treeTypes) {
            if (treeType.name.equals(name) && treeType.color == color && treeType.texture == texture) {
                return treeType;
            }
        }

        TreeType type = new TreeType(name, color, texture);
        treeTypes.add(type);

        return type;
    }
}
