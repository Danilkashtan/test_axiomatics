package com.example.test_axiomatics.controller;

import com.example.test_axiomatics.dto.RequestDto;
import com.example.test_axiomatics.dto.ResponseDto;
import com.example.test_axiomatics.service.QEService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qe")
@RequiredArgsConstructor
public class QEController {

    private final QEService qeService;

    // По стандарту HTTP, GET-запросы не должны иметь body, следовательно, я принял решение использовать POST-запрос.
    // Если необходим именно GET-запрос, то можно вместо body использовать параметры запроса.
    @PostMapping()
    public ResponseEntity<ResponseDto> getResult(@RequestBody RequestDto requestDto) {
        return ResponseEntity.status(200).body(qeService.getResult(requestDto));
    }
}
