package com.example.demo.Dtos;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
