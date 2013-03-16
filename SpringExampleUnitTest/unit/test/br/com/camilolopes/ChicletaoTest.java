package br.com.camilolopes;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
i
@ContextConfiguration(locations={"classpath:conf/idolos.xml"})
public class ChicletaoTest {
	@Autowired
	private Chicleteiro chicleteiro;
	
	@Test
	public void testCantar() {
	Chicletao chicletao = new Chicletao();
	chicletao.setChicleteiroMusica(chicleteiro);
	try{
		chicletao.apresentar();
	}catch (NullPointerException e) {
		Assert.fail("not expected result");
	}
	}

}
