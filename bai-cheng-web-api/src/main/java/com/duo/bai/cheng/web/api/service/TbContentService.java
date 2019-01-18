package com.duo.bai.cheng.web.api.service;



import com.duo.bai.cheng.web.api.web.dto.TbContentDTO;

import java.util.List;

public interface TbContentService {
    List<TbContentDTO> selectByCategoryId(Long categoryId);
}
