package cinepolis.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.ParameterizedType;

/**
 * Boilerplate for spring configuration avoiding spring boot config
 *
 */
public abstract class AbstractHandler<T> {

    private ApplicationContext applicationContext;

    public AbstractHandler() {
        Class typeParameterClass = ((Class) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0]);

        if (!typeParameterClass.isAnnotationPresent(Configuration.class)) {
            throw new RuntimeException(typeParameterClass + " is not a @configuration class");
        }

        applicationContext = new AnnotationConfigApplicationContext(typeParameterClass);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}

