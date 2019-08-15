package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.DAO.SourceDAO;
import com.jackcole.chronus.generated.jooq.tables.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SourceServiceImpl implements SourceService {

    private final SourceDAO sourceDAO;

    @Autowired
    public SourceServiceImpl(SourceDAO sourceDAO) {
        this.sourceDAO = sourceDAO;
    }

    @Override
    public List<Source> getAllSources() {
        return sourceDAO.get();
    }

}
