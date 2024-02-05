package example.RestAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// http://localhost:8080/courses
// /courses
//[
// {
//	 "id":1,
//	 "name":"Full Stack",
//	 "author": "Astha"
// }
//]

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieve()
	{
		return Arrays.asList(
				new Course(1,"Full Stack","Astha"),
				new Course(2,"Devops","Abc"),
				new Course(3,"Azure","Xyz"),
				new Course(4,"QA","Astha")
				);
	}
}
