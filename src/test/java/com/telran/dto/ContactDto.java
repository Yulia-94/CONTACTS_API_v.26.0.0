package com.telran.dto;

import lombok.*;

/**
 * {
 *   "address": "string",
 *   "description": "string",
 *   "email": "string",
 *   "id": number,
 *   "lastName": "string",
 *   "name": "string",
 *   "phone": "string"
 * }
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ContactDto {
    long id;
    String name;
    String lastName;
    String email;
    String phone;
    String address;
    String description;
}
