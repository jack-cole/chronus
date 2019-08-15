package com.jackcole.chronus.Controller;

import com.jackcole.chronus.Srervice.ParameterService;
import com.jackcole.chronus.generated.jooq.tables.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Provides information to the user about Streams
 */
@RestController
@RequestMapping("/api/parameter")
@Component
public class ParameterController {

    private final ParameterService parameterService;

    @Autowired
    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }


    /**
     * Get all parameters
     */
    @GetMapping("/")
    public List<Parameter> getAllParameters() {
        return parameterService.getAllParameters();
    }

    /**
     * Gets a single specified parameter
     * @param api_name The name of the parameter specified by the api_name
     */
    @GetMapping("/{api_name}")
    public Parameter getParameter(@PathVariable(value = "api_name") String api_name) {
        return parameterService.get(api_name);
    }


    /**
     * Sets the value of a single specified parameter
     * @param api_name The name of the parameter specified by the api_name
     */
    @PostMapping("/{api_name}")
    public Parameter setParameter(@PathVariable(value = "api_name") String api_name,
                               @RequestBody String value) {
        return parameterService.set(api_name, value);
    }
}
