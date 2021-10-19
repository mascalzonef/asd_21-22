package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.entities.Teacher;
import it.unical.inf.asd.uniprj.data.service.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class MyUniApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyUniApplication.class, args);
		TeacherService teacherService = context.getBean(TeacherService.class);
//		teacherService.add(new Teacher(....));
		List<Teacher> allTeacher = teacherService.getAllTeacher();
	}

}
