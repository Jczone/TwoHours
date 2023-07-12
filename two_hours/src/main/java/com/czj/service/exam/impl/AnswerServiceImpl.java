package com.czj.service.exam.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czj.mapper.exam.AnswerMapper;
import com.czj.pojo.exam.Answer;
import com.czj.service.exam.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 此处使用了mp提供的通用service模板
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements AnswerService {
    @Autowired
    private AnswerMapper answerMapper;
}
