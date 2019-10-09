package br.com.cwi.cursoaws.controller;

import br.com.cwi.cursoaws.service.MemoryLeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/leak")
public class MemoryLeakController {

    @Autowired
    private MemoryLeakService memoryLeakService;

    @GetMapping
    public void leakMemory() throws Exception {
        memoryLeakService.leakMemory();
    }

}
