package com.czj.service.com.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czj.mapper.com.ChapterLikeRecordsMapper;
import com.czj.pojo.com.ChapterLikeRecords;
import com.czj.service.com.ChapterLikeRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 此处使用了mp提供的通用service模板
public class ChapterLikeRecordsServiceImpl extends ServiceImpl<ChapterLikeRecordsMapper, ChapterLikeRecords> implements ChapterLikeRecordsService {
    @Autowired
    private ChapterLikeRecordsMapper chapterLikeRecordsMapper;

}
