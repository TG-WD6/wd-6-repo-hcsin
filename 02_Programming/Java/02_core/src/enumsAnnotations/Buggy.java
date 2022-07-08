package enumsAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Buggy {
    int priority();
    int severity();

    enum BugPriority {
        LOW,
        MEDIUM,
        HIGH
    }
    enum BugSeverity{
        CRITICAL,
        MAJOR,
        MODERATE,
        MINOR,
        COSMETIC
    }
}