package com.example.controller;

import com.example.Repository.ContactRepository;
import com.example.model.Contact;
import com.example.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ryan on 3/31/17.
 */

@RestController
@RequestMapping("api/v1/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // List All Contacts
    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public ResponseEntity<List<Contact>> getAllContacts() throws Throwable {
        return contactService.getAllContactsResponse();
    }

    // List One Contact
    @RequestMapping(value = "contacts/{id}", method = RequestMethod.GET)
    public ResponseEntity<Contact> getSingleContact(@PathVariable Long id) throws Throwable {
        return contactService.getSingleContactResponse(id);
    }


}
