package com.example.algamoney.api.repository.utils;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Query;

public class NativeQueryResultsMapper {
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> getResultList(Query query, Class<T> type) {
		return map(type, query.getResultList());
	}
	
	private static <T> List<T> map(Class<T> type, List<Object[]> records) {
		return records.stream().map(record -> map(type, record)).collect(Collectors.toList());
	}

	private static <T> T map(Class<T> type, Object[] tuple) {
		Class<?>[] tupleTypes = Stream.of(tuple)
					.map(Object::getClass)
						.collect(Collectors.toList()).toArray(new Class<?>[tuple.length]);
		try {
			Constructor<T> ctor = type.getConstructor(tupleTypes);
			return ctor.newInstance(tuple);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
