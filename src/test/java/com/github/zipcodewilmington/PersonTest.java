package com.github.zipcodewilmington;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/17/21 11:02 AM
 */
@Disabled
public class PersonTest {

    @ParameterizedTest
    @ValueSource(strings = {"Leon", "Dolio", "Kris", "Desa"})
    public void testSetFirstName(String firstName) {
        // given
        String expected = firstName;
        Person person = new Person();
        PersonInterface personInterface = (PersonInterface)person;
        personInterface.setFirstName(expected);

        // when
        String actual = personInterface.getFirstName();

        // then
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @ValueSource(strings = {"Hunter", "Durant", "Younger", "Burton"})
    public void testSetLastName(String lastName) {
        // given
        String expected = lastName;
        Person person = new Person();
        PersonInterface personInterface = (PersonInterface)person;
        personInterface.setLastName(expected);

        // when
        String actual = personInterface.getLastName();

        // then
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {28, 40, 50, 45})
    public void testSetAge(Integer age) {
        // given
        Integer expected = age;
        Person person = new Person();
        PersonInterface personInterface = (PersonInterface)person;
        personInterface.setAge(expected);

        // when
        String actual = personInterface.getLastName();

        // then
        Assertions.assertEquals(expected, actual);
    }
}
