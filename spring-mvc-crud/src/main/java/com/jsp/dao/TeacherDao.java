package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.jsp.dto.Teacher;

@Controller
public class TeacherDao {

	@Autowired
	EntityManagerFactory emf;

	public Teacher saveTeacher(Teacher teacher) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (teacher != null) {
			et.begin();
			em.persist(teacher);
			et.commit();

		}
		return teacher;
	}

	public Teacher getTeacherById(int id) {

		EntityManager em = emf.createEntityManager();
		return em.find(Teacher.class, id);

	}

	public List<Teacher> getAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select a from Teacher a");
		return query.getResultList();
	}

	public Teacher deleteTeacher(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Teacher s = em.find(Teacher.class, id);

		if (s != null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		return s;
	}

	public Teacher updateTeacher(Teacher teacher) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Teacher s = em.find(Teacher.class, teacher.getId());

		if (s != null) {
			etr.begin();
			em.merge(teacher);
			etr.commit();
		}
		return s;

	}

	public Teacher deleteByName(Teacher teacher) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Query q = em.createQuery("select a from Teacher a where name=?1");

		q.setParameter(1, teacher.getName());

		List<Teacher> list = q.getResultList();

		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
