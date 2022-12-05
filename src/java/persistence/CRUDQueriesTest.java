package persistence;

import junit.framework.TestCase;
import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(classes = PersistenceContextIntegrationTest.class)
@Transactional(transactionManager = "transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
public class CRUDQueriesTest extends TestCase {

  @Autowired
  private DSLContext dsl;

  @Test
  public void givenValidData_whenInserting_thenSucceed(){
    dsl.insertInto()
  }

}