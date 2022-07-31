package com.serve.api.controler;

import com.serve.api.dto.WorkerDto;
import com.serve.api.service.WorkerService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.serve.api.controler.endpoints.Endpoints.ID;
import static com.serve.api.controler.endpoints.Endpoints.WORKERS;

@RestController
@AllArgsConstructor
@RequestMapping(WORKERS)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkerController {

    WorkerService service;

    @GetMapping(ID)
    public WorkerDto getWorker(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody WorkerDto workerDto) {
        service.create(workerDto);
    }

    @GetMapping
    public List<WorkerDto> get() {
        return service.getAll();
    }

    @PutMapping(ID)
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void update(@PathVariable Long id, @RequestParam String position) {
        service.update(id, position);
    }

    @DeleteMapping(ID)
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        service.remove(id);
    }
}
