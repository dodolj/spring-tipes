package koschei.models;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Ocean1 {

    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}