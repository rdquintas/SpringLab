package zrq.com.resource.txtfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomResourceLoader implements ResourceLoaderAware {

	private ResourceLoader resourceLoader;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public void showResourceData() throws IOException {


		// Loading resource file from application folder
		// To load file from application folder, use below template:
//		Resource theFile = resourceLoader.getResource("file:fileExample.txt");

		// Loading resource file from classpath
		// To load file from classpath, use:
//		Resource theFile = resourceLoader.getResource("classpath:zrq/com/resource/txtfile/Readme.txt");
		
		// Loading resource file from file system
		// To load file from filesystem outside the application folder, use:
		Resource theFile = resourceLoader.getResource("file:c:/temp/filesystemdata.txt");
		
		// Loading resource file from any URL
		// To load file from any URL, use:
//		Resource theFile = resourceLoader.getResource("http://howtodoinjava.com/readme.txt");

		InputStream in = theFile.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
		reader.close();
	}
}