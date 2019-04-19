package validator;

import app.ConfigQuery;
import app.ConfigQueryDAO;
import validator.api.Validator;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

public class MetricNameLowerCaseValidator implements Validator<String> {

    @Override
    public void validate(List<String> args) {
        args.forEach(value-> doValidation(value.equals(value.toLowerCase()), "Metric name should be in Lower case")
        );
    }
}
