package com.filiphr.github;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pl.allegro.tech.embeddedelasticsearch.EmbeddedElastic;

/**
 * @author Filip Hrisafov
 */
public class ExampleTest {

    private EmbeddedElastic embeddedElastic = EmbeddedElastic.builder()
        .withElasticVersion("5.6.3")
        .withPlugin("mapper-attachments")
        .build();

    @Before
    public void setUp() throws Exception {
        embeddedElastic.start();
    }

    @Test
    public void name() {
        Assert.assertNotNull("embedded elastic is not null", embeddedElastic);
    }

    @After
    public void tearDown() {
        embeddedElastic.stop();
    }
}
