package com.duo.bai.cheng.web.api.dao;

import com.duo.bai.cheng.domain.TbContent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbContentDao {
    List<TbContent> selectByCategoryId(Long categoryId);
}
