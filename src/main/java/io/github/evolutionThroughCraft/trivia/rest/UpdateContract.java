/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.service.main.utils.ResourceUtility;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;
import io.github.evolutionThroughCraft.knowledge.repo.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
public class UpdateContract extends CreateContract {
    
    @Autowired
    private KnowledgeRepository knowledgeRepo;
    
    @Override
    public void validate(KnowledgeForm form) {
        // run create validations
        super.validate(form);
        // update specific validations
        ResourceUtility.ensureResource(form.getKnowledgeId(), "Knowledge Id Missing");
        ResourceUtility.ensureResource(form.getAnswer(), "Answer Missing");
        ResourceUtility.ensureResource(knowledgeRepo.getOne(form.getKnowledgeId()), "Existing Record Missing");        
    }
}
