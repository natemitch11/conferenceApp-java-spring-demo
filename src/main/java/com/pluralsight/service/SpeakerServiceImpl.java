package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    //CONSTRUCTOR FOR CONSTRUCTOR INJECTION
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }
    //CONSTRUCTOR FOR AUTOWIRED DEMO
    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
