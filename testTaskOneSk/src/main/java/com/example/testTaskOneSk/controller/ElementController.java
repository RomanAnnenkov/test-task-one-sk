package com.example.testTaskOneSk.controller;

import com.example.testTaskOneSk.controller.dto.RequestParameters;
import com.example.testTaskOneSk.model.CurrentNumber;
import com.example.testTaskOneSk.service.ElementService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ElementController {

    private ElementService service;

    @PostMapping("/modify")
    public ResponseEntity<CurrentNumber> modify(@RequestBody RequestParameters parameters) {
        try {
            CurrentNumber number = service.modify(parameters.getId(), parameters.getAdd());
            return ResponseEntity.ok(number);
        } catch (Exception e) {
            return ResponseEntity.status(418).build();
        }

    }
}
