package koschei.models;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Needle7 {

    private Death8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
