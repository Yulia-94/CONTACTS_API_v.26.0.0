package com.telran.dto;

import lombok.*;

/**
 * {
 *   "code": number,
 *   "details": "string",
 *   "message": "string",
 *   "timestamp": "2021-03-01T13:37:21.489Z"
 * }
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ErrorDto {
    int code;
    String message;
    String details;
}
