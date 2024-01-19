package unizar.gestion.ooapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import unizar.gestion.ooapi.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
