package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DockerStartTest {
/*public static void main(String[] args) {
	//Process p = Runtime.getRuntime().exec("docker run -d ubuntu:1404 /bin/bash");
	System.out.println("Start");
	try {
		//Process p = Runtime.getRuntime().exec("sh ~/Documents/docker_script.sh ubuntu 14.04");

		Runtime.getRuntime().exec("docker run -d ubuntu:1404 /bin/bash");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getLocalizedMessage());
	}
	
	System.out.println("Stop");
}*/



	/*public static void main(String[] args) {

		DockerStartTest obj = new DockerStartTest();

		String domainName = "google.com";
		
		//in mac oxs
		//String command = "ping -c 3 " + domainName;
		String command = "sh ~/Documents/trial.sh hello how";
		
		//in windows
		//String command = "ping -n 3 " + domainName;
		
		String output = obj.executeCommand(command);

		System.out.println(output);

	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			//p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}*/
	
/*	public static void main(String[] args) {
		try{
		String target = new String("/home/lenovo/docker_script.sh ubuntu 14.04");
		// String target = new String("mkdir stackOver");
		                        Runtime rt = Runtime.getRuntime();
		                        Process proc = rt.exec(target);
		                        proc.waitFor();
		                        StringBuffer output = new StringBuffer();
		                        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		                        String line = "";                       
		                        while ((line = reader.readLine())!= null) {
		                                output.append(line + "\n");
		                        }
		                        System.out.println("### " + output);
		                } catch (Throwable t) {
		                        t.printStackTrace();
		                }
	}
*/
}
