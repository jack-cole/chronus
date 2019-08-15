package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Source;

import java.util.List;

public interface SourceService {

    List<Source> getAllSources();


}
