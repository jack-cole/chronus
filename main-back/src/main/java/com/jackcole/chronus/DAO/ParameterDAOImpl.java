package com.jackcole.chronus.DAO;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.records.ParameterRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.jackcole.chronus.generated.jooq.tables.Parameter.PARAMETER;


@Component
public class ParameterDAOImpl implements ParameterDAO{

    private final DSLContext dslContext;

    @Autowired
    public ParameterDAOImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<Parameter> get() {
        return dslContext.select(PARAMETER.fields()).from(PARAMETER).fetchInto(Parameter.class);
    }

    @Override
    public Optional<Parameter> get(String api_name) {
        return dslContext.select(PARAMETER.fields()).from(PARAMETER)
                .where(PARAMETER.API_NAME.eq(api_name)).fetchOptionalInto(Parameter.class);
    }

    @Override
    public Optional<Parameter> updateValue(String api_name, String value) {
        int updatedRows = dslContext.update(PARAMETER).set(PARAMETER.VALUE, value).where(PARAMETER.API_NAME.eq(api_name)).execute();
        if(updatedRows != 1){
            // TODO: Throw exception
            return Optional.empty();
        }
        else
        {
            return get(api_name);
        }
    }
}
