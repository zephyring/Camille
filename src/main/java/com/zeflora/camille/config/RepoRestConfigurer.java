package com.zeflora.camille.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.zeflora.camille.model.Cat;
import com.zeflora.camille.model.Pet;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/15/18
 * Time: 10:01 AM
 */
@Configuration
public class RepoRestConfigurer extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
        objectMapper.registerModule(new SimpleModule() {
            @Override
            public void setupModule(SetupContext context) {
                context.addAbstractTypeResolver(
                    new SimpleAbstractTypeResolver().addMapping(
                        Pet.class,
                        Cat.class
                    )
                );
            }
        });
    }
}
