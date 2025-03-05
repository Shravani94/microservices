package com.example.HibernateAssociations.oneToManyAssociation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private int id;
    private String title;
    private String content;
}
