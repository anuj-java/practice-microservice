package com.sample.ms.application.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.sample.ms.application.model.Song;

/**
 * Integration test to execute controller
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SongControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCustomerDetailsTest() {
        Song body = this.restTemplate.getForObject("/songs/1", Song.class);
        System.out.println(body);
        assertThat(body.getSongName()).isEqualTo("All of Me");
    }

}
