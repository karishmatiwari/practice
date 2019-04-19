package validator;

import model.ConfigQuery;
import dao.ConfigQueryDAO;
import validator.api.Validator;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public class MetricAttributeSpecifiedValidator implements Validator<String> {
    @Override
    public void validate(List<String> args) {
        args.forEach(value-> {
            ConfigQueryDAO configQueryDAO = new ConfigQueryDAO();
            ConfigQuery configQuery = configQueryDAO.getConfigQuery(value);
            doValidation(configQuery.getConfigQueryAttributes().size() >= 1,
                    "No attribute present. At least one attribute should be there");
        });

    }
}
