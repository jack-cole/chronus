package com.jackcole.chronus.DAO;

import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Source;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.jackcole.chronus.generated.jooq.tables.Source.SOURCE;


@Component
public class SourceDAOImpl implements SourceDAO{

    private final DSLContext dslContext;

    @Autowired
    public SourceDAOImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<Source> get() {
        return dslContext.select(SOURCE.fields()).from(SOURCE).fetchInto(Source.class);
    }

}
