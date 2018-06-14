package com.example.girl.controller;

import com.example.girl.domain.Girl;
import com.example.girl.domain.Result;
import com.example.girl.properties.GirlProperties;
import com.example.girl.repository.GirlRepository;
import com.example.girl.serviceImpl.GirlServiceImpl;
import com.example.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Blue
 * @date 2018/6/12 14:04
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlServiceImpl girlService;

    @Autowired
    private GirlProperties girlProperties;

    /**
     * 查询所有女生
     *
     * @return
     */
    @GetMapping("/getList")
    public List<Girl> getList() {
        logger.info("getList");
        return girlRepository.findAll();
    }

    @PostMapping("/girlAdd")
    public Result girlAdd(@Validated Girl girl, BindingResult bindingResult) {
        Map<String,Object> map = new HashMap<>();
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError error : fieldErrors) {
                map.put(error.getField()+"Error",error.getDefaultMessage());
            }
            return ResultUtil.errorMap(map);
        }
        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping("/getOne/{id}")
    public Optional<Girl> getOne(@PathVariable("id") Integer id) {
        return girlRepository.findById(id);
    }

    @PutMapping("/update")
    public Girl updateGirl(Girl girl) {
        return girlRepository.save(girl);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
        return "ok";
    }

    @PostMapping("/two")
    public String insetTwo() {
        girlService.insertTwo();
        return "ok";
    }

    @GetMapping("/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        girlService.getAge(id);
    }

    @GetMapping("/testConfiguration")
    public void testConfiguration(){
        logger.info("test={}",girlProperties.getCupSize());


    }

}
