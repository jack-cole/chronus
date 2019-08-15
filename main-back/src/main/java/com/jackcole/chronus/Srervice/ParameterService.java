package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.generated.jooq.tables.Parameter;

import java.util.List;

public interface ParameterService {

    List<Parameter> getAllParameters();

    Parameter get(String api_name);

    Parameter set(String api_name, String value);
}
