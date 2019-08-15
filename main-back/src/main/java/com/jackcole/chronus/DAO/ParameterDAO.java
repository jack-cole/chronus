package com.jackcole.chronus.DAO;

import com.jackcole.chronus.generated.jooq.tables.Parameter;

import java.util.List;
import java.util.Optional;

public interface ParameterDAO {

    List<Parameter> get();

    Optional<Parameter> get(String api_name);

    Optional<Parameter> updateValue(String api_name, String api_value);
}
