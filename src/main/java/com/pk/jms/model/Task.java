package com.pk.jms.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Task
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
}