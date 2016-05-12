package com.solidbrain.russads.configuration;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.solidbrain.russads.configuration.model.ConfigurationProperty;

public interface ConfigurationPropertyRepository
		extends Repository<ConfigurationProperty, Long>
{
	List<ConfigurationProperty> findByKey(String key);
}
