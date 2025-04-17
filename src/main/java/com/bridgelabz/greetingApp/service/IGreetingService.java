package com.bridgelabz.greetingApp.service;


import com.bridgelabz.greetingApp.model.Greeting;
import com.bridgelabz.greetingApp.model.User;

// to create a contract between two classes
public interface IGreetingService {
    Greeting addGreeting(User user);

    Greeting getSimpleGreeting();

    Greeting giveGreeting(User user);

    Greeting getGreetingById(long id);

    Greeting updateGreeting(long id, String newMessage);
    void deleteGreeting(long id);
}
