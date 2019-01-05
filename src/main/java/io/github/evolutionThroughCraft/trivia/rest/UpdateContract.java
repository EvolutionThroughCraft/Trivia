/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.service.main.utils.ResourceUtility;
import io.github.evolutionThroughCraft.trivia.models.TriviaForm;
import io.github.evolutionThroughCraft.trivia.repo.TriviaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component("triviaUpdate")
public class UpdateContract extends CreateContract {
    
    @Autowired
    private TriviaRepository triviaRepo;
    
    @Override
    public void validate(TriviaForm form) {
        // run create validations
        super.validate(form);
        // update specific validations
        ResourceUtility.ensureResource(form.getTriviaId(), "Trivia Id Missing");
        ResourceUtility.ensureResource(form.getAnswer(), "Answer Missing");
        ResourceUtility.ensureResource(triviaRepo.getOne(form.getTriviaId()), "Existing Record Missing");        
    }
}
