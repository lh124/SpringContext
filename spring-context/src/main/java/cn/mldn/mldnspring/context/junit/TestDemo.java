package cn.mldn.mldnspring.context.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldnspring.context.service.IDeptService;
import cn.mldn.mldnspring.context.vo.Dept;
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
	@Resource
	private IDeptService service;
	@Test
	public void test() {
		Dept dept=new Dept();
		dept.setDeptno(10L);
		dept.setDname("Tom");
		TestCase.assertTrue(service.add(dept));

	}

}
