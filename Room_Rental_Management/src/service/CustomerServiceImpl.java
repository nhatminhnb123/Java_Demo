package service;

import com.google.gson.reflect.TypeToken;
import model.Customer;

import java.lang.reflect.Type;
import java.util.List;

public class CustomerServiceImpl extends AbstractCrudService<Customer> implements CustomerService {
    @Override
    protected String getFilePath() {
        return "";
    }

    @Override
    protected Type getTypeToken() {
        return new TypeToken<List<Customer>>() {}.getType();
    }
}
