package com.example.springCRUDDemo.repository;

import com.example.springCRUDDemo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    //Tutorial -> Entity type and Long --> primary key

   //findByPublished is a custom method()
   List<Tutorial> findByPublished(boolean published);
}
/*
In the above code, we used JpaRepository's methods: save(), findOne(),
findById(), findAll(), count(), delete(), deleteById()...without
implementing these methods.

We also defined custom finder methods named findByPublished(),
which returns all Tutorials with published having value as
 input published.
 */