package uk.cov.mjp.app.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
	
	@Autowired
	private SkillDao skillDao;

	@Cacheable(value = "skills")
	public Iterable<Skill> getAllSkills() {
		return skillDao.findAll();
	}
}
