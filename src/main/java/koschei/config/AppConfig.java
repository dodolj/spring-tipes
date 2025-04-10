package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Rabbit4 getRabbit(Duck5 duck) {
        return new Rabbit4(duck);
    }

    @Bean
    public Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }
}