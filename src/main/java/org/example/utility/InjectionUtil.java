package org.example.utility;

import static org.burningwave.core.assembler.StaticComponentContainer.Fields;

import java.lang.reflect.Field;
import java.util.Collection;

import org.burningwave.core.classes.FieldCriteria;
import org.example.annotations.Autowired;
import org.example.annotations.Qualifier;

public class InjectionUtil {

	private InjectionUtil() {
		super();
	}


	public static void autowire(Injector injector, Class<?> classz, Object classInstance)
			throws InstantiationException, IllegalAccessException {
		Collection<Field> fields = Fields.findAllAndMakeThemAccessible(
			FieldCriteria.forEntireClassHierarchy().allThoseThatMatch(field ->
				field.isAnnotationPresent(Autowired.class)
			), 
			classz
		);
		for (Field field : fields) {
			String qualifier = field.isAnnotationPresent(Qualifier.class)
					? field.getAnnotation(Qualifier.class).value()
					: null;
			Object fieldInstance = injector.getBeanInstance(field.getType(), field.getName(), qualifier);
			Fields.setDirect(classInstance, field, fieldInstance);
			autowire(injector, fieldInstance.getClass(), fieldInstance);
		}
	}

}