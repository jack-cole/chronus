package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Stream;

import java.util.List;

public interface StreamService {

    List<Stream> getAllStreams();

}
