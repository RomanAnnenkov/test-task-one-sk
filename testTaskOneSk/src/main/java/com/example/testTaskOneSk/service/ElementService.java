package com.example.testTaskOneSk.service;

import com.example.testTaskOneSk.model.CurrentNumber;
import com.example.testTaskOneSk.model.Element;
import com.example.testTaskOneSk.repository.ElementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ElementService {

    private ElementRepository repository;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public CurrentNumber modify(Long id, int add) {
        Element element = repository.getReferenceById(id);
        CurrentNumber currentNumber = element.getCurrentNumber();
        currentNumber.setCurrent(currentNumber.getCurrent() + add);
        repository.save(element);
        return currentNumber;
    }
}
