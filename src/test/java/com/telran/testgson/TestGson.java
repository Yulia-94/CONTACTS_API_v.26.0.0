package com.telran.testgson;

import com.google.gson.Gson;

public class TestGson {
    public static void main(String[] args) {

        Address address = new Address("Rehovot","Herzel",23);

        String[] phones = {"123456789","987654321"};

        Person person = new Person("John",32,address,phones,true,null);

        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);

        json = "{\"name\":\"John\",\"age\":32,\"address\":{\"city\":\"Rehovot\",\"street\":\"Herzel\",\"number\":23},\"phones\":[\"123456789\",\"987654321\"],\"isMarried\":true}";

        Person person1 = gson.fromJson(json,Person.class);
        System.out.println(person1);


    }
}
