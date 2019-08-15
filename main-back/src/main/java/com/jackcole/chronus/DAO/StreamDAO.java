package com.jackcole.chronus.DAO;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Source;
import com.jackcole.chronus.generated.jooq.tables.Stream;

import java.util.List;
import java.util.Optional;

public interface StreamDAO {

    List<Stream> get();

}
