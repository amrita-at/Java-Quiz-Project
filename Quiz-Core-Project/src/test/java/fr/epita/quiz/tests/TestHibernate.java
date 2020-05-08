package fr.epita.quiz.tests;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Question;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestHibernate {

	@PersistenceContext
	EntityManager em;
	
	
	@Test
	public void testFirstSessionFactory() {
		Question question = new Question();
		question.setTitle("Title goes here");
		em.persist(question);	
		
		Assert.assertNotEquals(0l, question.getId().longValue());
	}
	
	
}
