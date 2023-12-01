package com.example.TutorialStoreApplication.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.TutorialStoreApplication.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	//Tutorial -> Entity type and Long --> primary key
	
	//findByPublished is a custom method()
	List<Tutorial> findByPublished(boolean published);
	
}
/*
 * In the above code, we used JpaRepository’s methods: save(), findOne(), findById(), 
 * findAll(), count(), delete(), 
 * deleteById() without implementing these methods.
 * 
 * We also defined custom finder methods named findByPublished(), which returns all 
 * Tutorials with published having value as input published.
 */
