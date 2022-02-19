package com.example.customer.models;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
