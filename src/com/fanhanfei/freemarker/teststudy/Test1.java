package com.fanhanfei.freemarker.teststudy;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;




import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
* @ClassName: Test1 
* @Description: FreeMarker学习 
* @author junshuaizhang@163.com
* @date 2015年11月18日 上午10:23:06 
*
 */

public class Test1 {

	public static void main(String[] args) throws IOException, TemplateException {
		Configuration configuration = new Configuration();
		
		configuration.setDirectoryForTemplateLoading(new File("templates"));
		
		HashMap root = new HashMap();
		root.put("user", "老高");
		
		User u = new User();
		u.setUname("老马");
		root.put("user1", u);
		User u2 = new User("老张",new Address("中国","北京"));
		root.put("user2", u2);
		
		//map/list容器
		List list = new ArrayList();
		list.add(new Address("中国","北京"));
		list.add(new Address("中国","上海"));
		list.add(new Address("美国","纽约"));
		root.put("lst", list);
		
		//普通标量??
		root.put("num0", 18);
		root.put("b2", true);
		root.put("date1", new Date());
		root.put("random", new Random().nextInt(100));
		root.put("htm2", "<b>粗体</b>");
		
		
		Template template = configuration.getTemplate("a.ftl");
		
		Writer out = new OutputStreamWriter(System.out);
		template.process(root, out);
		out.flush();
		out.close();
		

	}

}
