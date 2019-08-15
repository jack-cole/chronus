package com.jackcole.chronus.DAO;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Stream;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.jackcole.chronus.generated.jooq.tables.Stream.STREAM;


@Component
public class StreamDAOImpl implements StreamDAO{

    private final DSLContext dslContext;

    @Autowired
    public StreamDAOImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<Stream> get() {
        return dslContext.select(STREAM.fields()).from(STREAM).fetchInto(Stream.class);
    }


}
