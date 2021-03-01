package com.telran.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class GetAllContactsResponseDto {
    List<ContactDto> contacts;
}
