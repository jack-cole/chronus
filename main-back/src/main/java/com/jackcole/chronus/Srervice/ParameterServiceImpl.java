package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.DAO.ParameterDAO;
import com.jackcole.chronus.generated.jooq.tables.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ParameterServiceImpl implements ParameterService {

    private final ParameterDAO parameterDAO;

    @Autowired
    public ParameterServiceImpl(ParameterDAO parameterDAO) {
        this.parameterDAO = parameterDAO;
    }

    @Override
    public List<Parameter> getAllParameters() {
        return parameterDAO.get();
    }

    @Override
    public Parameter get(String api_name) {
        return parameterDAO.get(api_name).orElseThrow(() -> new RuntimeException("Not found"));

    }

    @Override
    @Transactional
    public Parameter set(String api_name, String value) {
        return parameterDAO.updateValue(api_name, value).orElseThrow(() -> new RuntimeException("Not found"));
    }
}
