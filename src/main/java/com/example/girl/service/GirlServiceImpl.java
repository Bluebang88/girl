package com.example.girl.service;

import com.example.girl.domain.Girl;
import com.example.girl.enums.ResultEnum;
import com.example.girl.exception.GirlException;
import com.example.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Blue
 * @date 2018/6/12 15:46
 */
@Service
public class GirlServiceImpl {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(12);
        girlA.setCupSize("F");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(15);
        girlB.setCupSize("C");
        girlRepository.save(girlB);

    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10 ) {
            //小学
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age <16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

    }
}
