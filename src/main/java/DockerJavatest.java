package main.java;

import java.util.List;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.api.model.SearchItem;
import com.github.dockerjava.core.DockerClientBuilder;

public class DockerJavatest {
	public static void main(String[] args) {
		DockerClient dockerClient = DockerClientBuilder.getInstance("http://localhost:2375").build();
		
		Info info = dockerClient.infoCmd().exec();
		System.out.println(info);
		
		List<SearchItem> dockerSearch = dockerClient.searchImagesCmd("hello-world").exec();
		System.out.println("Search returned" + dockerSearch.toString());
		
	CreateContainerResponse container = dockerClient.createContainerCmd("ujjwalsubedi/tcujjwal:v1")
				   .withCmd("/bin/bash")
				   .exec();

				dockerClient.startContainerCmd(container.getId()).exec();
	}
}
