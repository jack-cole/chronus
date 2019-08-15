package com.jackcole.chronus.Controller;


import com.jackcole.chronus.Srervice.SourceService;
import com.jackcole.chronus.generated.jooq.tables.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/source")
@Component
public class SourceController {


    private final SourceService sourceService;

    @Autowired
    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }


    @GetMapping("/")
    public List<Source> getAllSources() {
        return sourceService.getAllSources();
    }
}
