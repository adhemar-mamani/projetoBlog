package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
@Component
public class DummyData {

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	//@PostConstruct
	public void savePosts() {

		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Adhemar Mamani");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel dictum nisi. Cras porttitor tristique felis id viverra. Nullam volutpat ante et libero imperdiet accumsan. Quisque suscipit facilisis ultricies. Quisque rutrum lectus sem, nec imperdiet tortor convallis eu. Nulla lacinia odio ut velit consequat, venenatis ultrices eros eleifend.");
		
		Post post2 = new Post();
		post2.setAutor("Isabella Silva");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel dictum nisi. Cras porttitor tristique felis id viverra. Nullam volutpat ante et libero imperdiet accumsan. Quisque suscipit facilisis ultricies. Quisque rutrum lectus sem, nec imperdiet tortor convallis eu. Nulla lacinia odio ut velit consequat, venenatis ultrices eros eleifend.");
		
		
		postList.add(post1);
		postList.add(post2);
		
		for (Post post : postList) {
			Post postSaved = codeBlogRepository.save(post);
			System.out.println(postSaved.getId());
		}
		
	}
	
}
