package com.mycompany.property_managemen.controller;

import com.mycompany.property_managemen.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorController {

    @GetMapping("add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        return num1 + num2;
    }

    @GetMapping("subtract/{num1}/{num2}")
    public BigDecimal sub(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        if(!(num1 > num2)){
            Double value = num2 - num1;
            return new BigDecimal(value).setScale(3, RoundingMode.HALF_UP);
        }
        Double value = num1 - num2;
        return new BigDecimal(value).setScale(3, RoundingMode.HALF_UP);
    }

    @GetMapping("multiProcessSubtraction/{num1}/{num2}")
    public BigDecimal multiSubtraction(@PathVariable("num1") Double num1,
                                       @PathVariable("num2") Double num2,
                                       @RequestParam("num3") Double num3){
        Double value = Math.abs(num3 - num1 - num2);
        return new BigDecimal(value).setScale(3, RoundingMode.HALF_UP);
    }

    @PostMapping("/mul")
    public ResponseEntity multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result;

        result = calculatorDTO.getNum1() * calculatorDTO.getNum2()
                * calculatorDTO.getNum3() * calculatorDTO.getNum4();

        ResponseEntity<Double> response = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return response;
    }
}
