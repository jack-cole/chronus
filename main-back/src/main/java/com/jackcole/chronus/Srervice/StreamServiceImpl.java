package com.jackcole.chronus.Srervice;

import com.jackcole.chronus.DAO.ParameterDAO;
import com.jackcole.chronus.DAO.StreamDAO;
import com.jackcole.chronus.generated.jooq.tables.Parameter;
import com.jackcole.chronus.generated.jooq.tables.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class StreamServiceImpl implements StreamService {

    private final StreamDAO streamDAO;

    @Autowired
    public StreamServiceImpl(StreamDAO streamDAO) {
        this.streamDAO = streamDAO;
    }

    @Override
    public List<Stream> getAllStreams() {
        return streamDAO.get();
    }

}
