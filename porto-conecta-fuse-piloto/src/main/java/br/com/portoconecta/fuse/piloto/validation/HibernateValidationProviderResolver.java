package br.com.portoconecta.fuse.piloto.validation;

import java.util.Collections;
import java.util.List;

import javax.validation.ValidationProviderResolver;
import javax.validation.spi.ValidationProvider;

import org.hibernate.validator.HibernateValidator;

/**
 * Habilita a implementação do Bean Validation para o Hibernate Validator.
 * 
 * Essa classe é necessária por o Fuse rodar em um container OSGI (Apache Karaf) e não um container Java EE.
 * @author asouza
 *
 */
public class HibernateValidationProviderResolver implements ValidationProviderResolver{

	@Override
	public List<ValidationProvider<?>> getValidationProviders() {
		return Collections.singletonList(new HibernateValidator());
	}


}
