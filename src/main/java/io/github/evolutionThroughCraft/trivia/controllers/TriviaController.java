/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.controllers;


import io.github.evolutionThroughCraft.common.service.main.routes.TriviaRoutes;
import io.github.evolutionThroughCraft.common.service.main.utils.ResourceUtility;
import io.github.evolutionThroughCraft.trivia.models.TriviaForm;
import io.github.evolutionThroughCraft.trivia.rest.CreateOperation;
import io.github.evolutionThroughCraft.trivia.rest.UpdateOperation;
import java.util.List;
import javax.validation.Valid;
import lombok.Getter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.github.evolutionThroughCraft.trivia.repo.TriviaRepository;

/**
 *
 * @author dwin
 */
@RestController
@RequestMapping
@Getter
public class TriviaController implements TriviaRoutes {
    
    private static final Logger scribe = Logger.getLogger(TriviaController.class);

//    @Autowired
//    private TriviaRepository triviaRepo;
    
    @Autowired
    private CreateOperation createOperation;
    
//    @Autowired
//    private CheckUniqueOperation checkUniqueOperation;
    
    @Autowired
    private UpdateOperation addAnswerOperation;
    
    @GetMapping(GET_TRIVIA_PATH)
    public List<TriviaForm> findMatching(@Valid @RequestBody TriviaForm form) {
        return null;
    }
    
    @PostMapping(POST_TRIVIA_PATH)
    @ResponseStatus(HttpStatus.CREATED)
    public TriviaForm createKnowledge(@Valid @RequestBody TriviaForm form) {
        return getCreateOperation().run(form);
    }
    
    @PutMapping(PUT_TRIVIA_PATH)
    @ResponseStatus(HttpStatus.OK)
    public TriviaForm updateKnowledge(
                                @PathVariable(TRIVIA_ID_VAR) Long id,
                                @Valid @RequestBody TriviaForm form
    ) {
        ResourceUtility.ensureIdsEqual(id, form.getTriviaId());
        return addAnswerOperation.run(form);
    }
}
