package com.example.test_axiomatics.service;

import com.example.test_axiomatics.dto.RequestDto;
import com.example.test_axiomatics.dto.ResponseDto;
import com.example.test_axiomatics.exception.CalculationException;
import org.springframework.stereotype.Service;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

@Service
public class CalculateService {

    public ResponseDto calculate(RequestDto requestDto) {
        Long a = requestDto.getA();
        Long b = requestDto.getB();
        Long c = requestDto.getC();
        if (a == 0) {
            throw new CalculationException("The value of a cannot be 0.");
        }
        Long d = b * b - 4 * a * c;
        Double sqrtval = sqrt(abs(d));
        if (d > 0) {
            return new ResponseDto(String.valueOf((double) (-b + sqrtval) / (2 * a)), String.valueOf((double) (-b - sqrtval) / (2 * a)));
        } else if (d == 0) {
            return new ResponseDto(String.valueOf(-(double) b / (2 * a)), String.valueOf(-(double) b / (2 * a)));
        } else {
            return new ResponseDto(-(double) b / (2 * a) + " + i" + sqrtval, -(double) b / (2 * a) + " - i" + sqrtval);
        }
    }
}
