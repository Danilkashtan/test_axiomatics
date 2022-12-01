package com.example.test_axiomatics.service;

import com.example.test_axiomatics.dto.RequestDto;
import com.example.test_axiomatics.dto.ResponseDto;
import com.example.test_axiomatics.entity.Request;
import com.example.test_axiomatics.entity.Response;
import com.example.test_axiomatics.repository.RequestRepository;
import com.example.test_axiomatics.repository.ResponseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class QEServiceImpl implements QEService {

    private final CalculateService calculateService;

    private final RequestRepository requestRepository;

    private final ResponseRepository responseRepository;

    @Override
    public ResponseDto getResult(RequestDto requestDto) {
        Request requestEntity = new Request();
        requestEntity.setA(requestDto.getA());
        requestEntity.setB(requestDto.getB());
        requestEntity.setC(requestDto.getC());
        requestEntity = requestRepository.save(requestEntity);

        ResponseDto result = calculateService.calculate(requestDto);

        Response responseEntity = new Response();
        responseEntity.setX1(result.getX1());
        responseEntity.setX2(result.getX2());
        responseEntity.setRequest(requestEntity);
        responseRepository.save(responseEntity);

        return result;
    }
}
