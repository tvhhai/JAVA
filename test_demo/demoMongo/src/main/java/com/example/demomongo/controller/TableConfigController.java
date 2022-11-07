package com.example.demomongo.controller;

import com.example.demomongo.entity.TableConfig;
import com.example.demomongo.entity.Test;
import com.example.demomongo.repository.TableConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TableConfigController {
    @Autowired
    private TableConfigRepo tableConfigRepo;

    @GetMapping("/table-config")
    public ResponseEntity<List<TableConfig>> getAllTutorials() {
        List<Test> test = new ArrayList<>();
        return new ResponseEntity<>(tableConfigRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/table-config")
    public ResponseEntity<TableConfig> save(@RequestBody TableConfig tableConfig) {
        System.out.println(tableConfig);
        TableConfig _tableConfig = tableConfigRepo.save(tableConfig);
        return new ResponseEntity<>(_tableConfig, HttpStatus.CREATED);
    }

    @PutMapping("/table-config/{id}")
    public ResponseEntity<TableConfig> updateTutorial(@PathVariable("id") String id, @RequestBody TableConfig tableConfig) {

        Optional<TableConfig> tutorialData = Optional.ofNullable(tableConfigRepo.findByTableId(id));
        System.out.println(tutorialData);
        System.out.println(tableConfig + " " + id);

        if (tutorialData.isPresent()) {
            TableConfig _tutorial = tutorialData.get();
            _tutorial.setConfigJson(tableConfig.getConfigJson());
            return new ResponseEntity<>(tableConfigRepo.save(_tutorial), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
