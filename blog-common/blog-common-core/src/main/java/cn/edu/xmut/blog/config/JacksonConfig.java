package cn.edu.xmut.blog.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * @author Zeeman Zhang
 */
@Configuration
public class JacksonConfig {

    private static class StringJsonDeserializer extends StdScalarDeserializer<String> {

        private StringJsonDeserializer() {
            super(String.class);
        }

        @Override
        public String deserialize(JsonParser parser, DeserializationContext ctx)
                throws IOException {
            return StringUtils.trimWhitespace(parser.getValueAsString());
        }
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customizer() {
        return builder -> builder.deserializerByType(String.class, new StringJsonDeserializer());
    }
}
