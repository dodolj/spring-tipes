package koschei.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Egg6 {

    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
