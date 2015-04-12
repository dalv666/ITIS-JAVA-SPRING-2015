package su.dalv.itis.java.spring.task24.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import su.dalv.itis.java.spring.task24.model.Person;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class HelloController {


    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String nullErrorResolver(NullPointerException e){
        return "You broke site...";
    }

    @ResponseBody
    @RequestMapping(value = "/responseBody/hello", method = RequestMethod.GET)
    public String helloResponse() {
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }


    @RequestMapping(value = "/print/{parametr}")
    @ResponseBody
    public String printAllHead(@PathVariable String parametr, HttpServletRequest httpServletRequest) {
        StringBuilder stringBuilder = new StringBuilder("param is ").append(parametr + ". ");
        Enumeration headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            stringBuilder.append(httpServletRequest.getHeader(headerNames.nextElement().toString())+"\n");
        }
        return stringBuilder.toString();
    }


    @RequestMapping(value = "/string-to-string", method = RequestMethod.POST)
    @ResponseBody
    public String returnString(@RequestBody String s) {
        return s;
    }

    @ResponseBody
    @RequestMapping(value = "/xmjs-to-xmjs", method = RequestMethod.POST,produces = {"application/xml","application/json"})
    public Person returnJson(@RequestBody Person person) {
        return person;
    }


    @RequestMapping(value = "/entity-to-response", method = RequestMethod.POST)
    public ResponseEntity<String> httpEntityReturnString(HttpEntity<String> entity) {
        String body = entity.getBody();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/entity-to-response");
        ResponseEntity<String> s = new ResponseEntity<String>(body, httpHeaders, HttpStatus.CREATED);
        return s;
    }

    @RequestMapping("/error")
    public String string() {
        throw new NullPointerException();
    }


    @RequestMapping("/person/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String createPerson(Person person) {
        return String.valueOf(person.getId());
    }

    @RequestMapping("/person")
    public String person(){
        return "personCreate";
    }


    @RequestMapping(value = "/form/person/create",method = RequestMethod.GET)
    public String addPerson(Model model) {
        Person person = new Person();
        person.setId(1l);
        person.setName("Vladislav");
        person.setIsAdmin(true);
        model.addAttribute(person);
        return "personForm";
    }

    @RequestMapping(value = "/form/person/create",method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String createPers(Person person){
        return new String("Create: " + person().toString());
    }

}
