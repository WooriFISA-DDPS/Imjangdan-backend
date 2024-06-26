package imjangdan.ddps.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(){

        Info info = new Info()
                .version("v1.0.0")
                .title("임장단 땅판소년단 API")
                .description("ddps api");

        return new OpenAPI().info(info);
    }

}
