package com.web;

import com.dao.PartDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelerController {
    private PartDao partDao;

    @Autowired
    public void setPartDao(SqlSessionTemplate sqlSessionTemplate) {
        this.partDao = sqlSessionTemplate.getMapper(PartDao.class);
    }

    @RequestMapping(path = "test", method = RequestMethod.GET)
    public String test() {
        partDao.insertPart(1, "sdf", "sdf", "sdf", "sdf", 88, "oij", 1);
        return "modeler";
    }
}
