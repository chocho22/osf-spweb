package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.osf.web.dao.EmpDAO;

public class DAOExam {
	
	@Autowired
	private EmpDAO edao;

	@Test
	public void selectEmpListTest() {
		Map<String, String> emp = new HashMap<String,String>();
		assertNotEquals(edao.selectEmpList(emp).size(), 0);
	}
}
