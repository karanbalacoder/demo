package com.karan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static boolean check(String s){
       return s.length()>4;
    }
    public static String add(String s){
        return s.concat("bala");
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("karan", "bala", "delhi", "shiva");
        List<Employee> employees = Arrays.asList(new Employee(1, "bala"),
                new Employee(2, "karan"),
                new Employee(3, "bikarno"));

        List<String> collect = names.stream().filter(App::check).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        List<String> collect1 = names.stream().map(App::add).collect(Collectors.toList());
        collect1.stream().forEach(System.out::println);
        boolean bala = employees.stream().map(Employee::getName).anyMatch(s->s.startsWith("bala1"));
        System.out.println(bala);
    }
}

