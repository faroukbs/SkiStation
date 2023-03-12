package tn.esprit.farouk.skistation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SkiStationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiStationApplication.class, args);
    }

}
