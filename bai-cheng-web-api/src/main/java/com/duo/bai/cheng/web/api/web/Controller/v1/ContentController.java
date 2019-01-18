package com.duo.bai.cheng.web.api.web.Controller.v1;


import com.duo.bai.cheng.web.api.service.TbContentService;
import com.duo.bai.cheng.web.api.web.dto.TbContentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.path.v1}/contents")
public class ContentController {

    @Autowired
    TbContentService tbContentService;
    @RequestMapping(value="{categoryId}",method = RequestMethod.GET)
    public List<TbContentDTO> find(@PathVariable("categoryId") Long categoryId){
        List<TbContentDTO> tbContents = tbContentService.selectByCategoryId(categoryId);

        System.out.println("====="+tbContents);
        return tbContents;
    }
}
