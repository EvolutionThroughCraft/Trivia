/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.SimpleOperation;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;
import io.github.evolutionThroughCraft.knowledge.repo.KnowledgeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
public class GetMatchingOperation extends SimpleOperation<KnowledgeForm, List<KnowledgeForm>>{
    
    @Autowired
    private KnowledgeRepository knowledgeRepo;
        
    @Override
    public List<KnowledgeForm> perform(KnowledgeForm request) {
        
        return null;
    }
}
