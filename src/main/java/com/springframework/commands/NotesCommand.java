package com.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 27/09/21
 */
@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
}