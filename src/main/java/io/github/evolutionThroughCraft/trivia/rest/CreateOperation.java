/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.ContractOperation;
import io.github.evolutionThroughCraft.common.arch.orchestrators.Operation;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeEntity;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;
import io.github.evolutionThroughCraft.knowledge.repo.KnowledgeRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
@Getter
public class CreateOperation extends ContractOperation<KnowledgeForm, KnowledgeForm, CreateContract> {

    @Autowired
    private KnowledgeRepository knowledgeRepo;
    
    @Override
    public KnowledgeForm perform(KnowledgeForm form) {
        KnowledgeEntity entity = new KnowledgeEntity(form);
        KnowledgeEntity saved = getKnowledgeRepo().save(entity);
        return new KnowledgeForm(saved);
    }
}
