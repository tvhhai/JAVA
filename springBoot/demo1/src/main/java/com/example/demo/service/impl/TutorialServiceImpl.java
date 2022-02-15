package com.example.demo.service.impl;

import com.example.demo.entity.Tutorial;
import com.example.demo.repository.TutorialRepository;
import com.example.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;


    @Override
    public List<Tutorial> searchTutorial(String term) {
        return tutorialRepository.findByTitleContaining(term);
    }

    @Override
    public List<Tutorial> getAllTutorial() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial getTutorialById(long id) {
        Optional<Tutorial> optional = tutorialRepository.findById(id);
        Tutorial tutorial;
        if (optional.isPresent()) {
            tutorial = optional.get();
        } else {
            return null;
        }
        return tutorial;
    }

    @Override
    public Tutorial saveTutorial(Tutorial tutorial) {
        return tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
    }

    @Override
    public void deleteTutorialById(long id) {

    }
}
