package com.axioma.axiomatrainee.service;

import com.axioma.axiomatrainee.repository.IHomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HomeworkService {

    private IHomeworkRepository IHomeworkRepository;

    @Autowired
    public void setIHomeworkRepository(IHomeworkRepository iHomeworkRepository) {
        this.IHomeworkRepository = iHomeworkRepository;
    }

}
