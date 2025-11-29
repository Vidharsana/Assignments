package com.mphasis.MphasisProj05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeTest {

	public Stream<Shape> shapeProvider(){
		return Stream.of(new Shape(),new Circle(),new Triangle());
	}
	@ParameterizedTest
	@MethodSource("shapeProvider")
	public static void typeTest(Shape shape) {
		Shape res=shape.type();
		assertTrue(res instanceof Shape || res instanceof Circle || res instanceof Triangle);
	}
}
