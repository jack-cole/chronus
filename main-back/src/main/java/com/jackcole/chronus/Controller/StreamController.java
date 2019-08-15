package com.jackcole.chronus.Controller;


import com.jackcole.chronus.Srervice.StreamService;
import com.jackcole.chronus.generated.jooq.tables.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stream")
@Component
public class StreamController {

    private final StreamService streamService;

    @Autowired
    public StreamController(StreamService streamService) {
        this.streamService = streamService;
    }

    @GetMapping("/")
    public List<Stream> getAllStreams() {
        return streamService.getAllStreams();
    }

    @GetMapping("/{streamId}")
    public Stream getStream(@PathVariable(value = "streamId") long streamId) {
        return streamService.getStream(streamId);
    }

    @PostMapping("/")
    public Stream createStream(@RequestBody Stream stream) {
        return streamService.createStream(stream);
    }

    @PostMapping("/{streamId}")
    public Stream updateStream(@PathVariable(value = "streamId") long streamId, @RequestBody Stream stream) {
        return streamService.updateStream(stream);
    }
}
