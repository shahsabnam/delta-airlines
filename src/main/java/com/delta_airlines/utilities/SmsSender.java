package com.delta_airlines.utilities;

import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsSender {
    public static final String ACCOUNT_SID = "AC906719e2c285ce351491defad57d2fa7";
    public static final String AUTH_TOKEN = "9d623d62c067214d258e20b12eccf4e9";

    public  void sendSMS(String toAddress) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                new PhoneNumber(toAddress),
                new PhoneNumber("+14176412343"),
                " Your Bank Balance is 0.0. Please credit your account")
            .create();
        System.out.println(message);

    }}
