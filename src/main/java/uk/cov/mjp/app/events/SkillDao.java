package uk.cov.mjp.app.events;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillDao extends CrudRepository<Skill, Long> {
	
	// We'll just use the default methods from CrudRepository.

}
