package examportal.lazimonki.com.student.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import examportal.lazimonki.com.student.ResponsePayload.responsePayload;
import examportal.lazimonki.com.student.beans.student;

/**
 * StudentController
 */
@RestController
public class StudentController {

    @GetMapping("/helloWorld")
    public responsePayload helloWorld()
    {
        HashMap<String,Object>hm =new HashMap<>();
        hm.put("student",new student(1,"madhukar"));
        return new responsePayload("Ok","success",hm);
    }
    
}