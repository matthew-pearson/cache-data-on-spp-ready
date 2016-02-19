package uk.cov.mjp.app.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventsListener {
	
	private static final Logger log = LoggerFactory.getLogger(MyEventsListener.class);

	@Autowired
	SkillService skillsService;

	@EventListener
	public void onApplicationReady(ApplicationReadyEvent started) {
		log.info("Application is ready. So prime the cache by invoking the skills service. You can see the sql statements in the log.");
		Iterable<Skill> allSkills = skillsService.getAllSkills();
		log.info("Got skills: " + allSkills);

		log.info("Invoking the skills service again, but this time it will get the skills from the cache, not the database. No sql statements will appear in the log.");
		Iterable<Skill> allSkills2 = skillsService.getAllSkills();
		log.info("Got skills: " + allSkills2);
	}
}
