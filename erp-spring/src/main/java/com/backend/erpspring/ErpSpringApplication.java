package com.backend.erpspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.backend.erpspring.Entities.*;
import com.backend.erpspring.repository.FeaturesMethodsRepository;
import com.backend.erpspring.repository.FeaturesRepository;
import com.backend.erpspring.repository.ProfilesFeaturesRepository;
import com.backend.erpspring.repository.ProfilesRepository;

@SpringBootApplication
public class ErpSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(
        ProfilesRepository profilesRepository, 
        FeaturesRepository featuresRepository, 
        FeaturesMethodsRepository featuresMethodsRepository, 
        ProfilesFeaturesRepository profilesFeaturesRepository) {
    return args -> {
        profilesRepository.deleteAll();
        featuresRepository.deleteAll();
        featuresMethodsRepository.deleteAll();
        profilesFeaturesRepository.deleteAll();

        List<ProfilesEntity> profiles = Arrays.asList(
                new ProfilesEntity("admin"), 
                new ProfilesEntity("user"), 
                new ProfilesEntity("vendor"), 
                new ProfilesEntity("consultant")
        );
        profilesRepository.saveAll(profiles);

        List<FeaturesEntity> features = Arrays.asList(
                new FeaturesEntity("sales"), 
                new FeaturesEntity("all"), 
                new FeaturesEntity("products"), 
                new FeaturesEntity("warehouse")
        );
        featuresRepository.saveAll(features);

        List<FeaturesMethodsEntity> featureMethods = Arrays.asList(
                new FeaturesMethodsEntity("POST"), 
                new FeaturesMethodsEntity("GET"), 
                new FeaturesMethodsEntity("PUT"), 
                new FeaturesMethodsEntity("PATCH")
        );
        featuresMethodsRepository.saveAll(featureMethods);

        profiles.stream().forEach(profile -> {
            features.stream().forEach(feature -> {
                featureMethods.stream().forEach(featureMethod -> {
                    if (profile.getName().equals("admin") || profile.getName().equals("consultant") 
                        || featureMethod.getName().equals("POST") || featureMethod.getName().equals("GET")) {
                        ProfilesFeaturesEntity profileFeature = new ProfilesFeaturesEntity(profile, feature);
                        profilesFeaturesRepository.save(profileFeature);
                    }
                });
            });
        });
    };
}

}
