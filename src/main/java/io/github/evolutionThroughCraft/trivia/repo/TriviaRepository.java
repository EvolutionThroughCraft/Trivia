/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.repo;

import io.github.evolutionThroughCraft.knowledge.models.KnowledgeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dwin
 */
public interface TriviaRepository extends JpaRepository<KnowledgeEntity, Long> {
    
    public List<KnowledgeEntity> findByQuestionLikeIgnoreCase(String question);
}
