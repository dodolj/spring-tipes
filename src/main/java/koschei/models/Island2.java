package koschei.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Island2 {

    private Wood3 wood;

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
