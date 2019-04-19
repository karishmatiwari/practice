package validator;

import app.ConfigQuery;
import app.ConfigQueryDAO;
import validator.api.Validator;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public class MetricUniquenessValidator implements Validator<String> {
    @Override
    public void validate(List<String> args) {
        args.forEach(value->{
            ConfigQueryDAO configQueryDAO = new ConfigQueryDAO();
            ConfigQuery configQuery = configQueryDAO.getConfigQuery(value);
            doValidation(configQuery== null, "Metric name is not unique");

        });


    }
}
