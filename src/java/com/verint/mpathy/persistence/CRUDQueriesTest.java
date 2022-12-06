package com.verint.mpathy.persistence;

import junit.framework.TestCase;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.verint.mpathy.db.live.tables.Site;

@ContextConfiguration(classes = PersistenceContextIntegrationTest.class)
@Transactional(transactionManager = "transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
public class CRUDQueriesTest extends TestCase {

  @Autowired
  private DSLContext dsl;

  private final Site site = Site.SITE;

  @Test
  public void givenValidData_whenInserting_thenSucceed(){
    final int salt = (int) (1 + (Math.random() * 1000));
    dsl.insertInto(site)
        .set(site.IDSITE, salt)
        .set(site.FORESEESITEKEY, "random Test Key")
        .set(site.NAME, "random Test Site")
        .execute();

    Result<Record3<Integer, String, String>> result1 = dsl
        .select(site.IDSITE, site.FORESEESITEKEY, site.NAME)
        .from(site)
        .where(site.IDSITE.equal(salt))
        .fetch();

    assertEquals(result1.size(), 1);

    dsl.deleteFrom(site)
        .where(site.IDSITE.equal(salt))
        .execute();

    Result<Record3<Integer, String, String>> result2 = dsl
        .select(site.IDSITE, site.FORESEESITEKEY, site.NAME)
        .from(site)
        .fetch();

    assertEquals(result2.size(), 0);
  }

}