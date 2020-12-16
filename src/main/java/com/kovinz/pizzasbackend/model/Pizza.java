package com.kovinz.pizzasbackend.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kovinz.pizzasbackend.serializer.SizeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    private String name;
    private Integer price;
    private Integer category;
    private Integer rating;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pizza_type",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private Set<Type> types;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pizza_size",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "size_id")
    )
    @JsonSerialize(using = SizeSerializer.class)
    private Set<Size> sizes;

}
