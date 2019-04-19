package validator.api;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public interface Validator<T> {
    void validate(List<T> args);

    default void doValidation(Boolean validationCondition, String reason){
        if (!validationCondition) {
            System.out.println("Validation Failed with Reason "+reason);
            System.exit(1);//todo
        }

    }
}
