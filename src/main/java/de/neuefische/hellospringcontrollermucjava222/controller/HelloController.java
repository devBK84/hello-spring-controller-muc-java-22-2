package de.neuefische.hellospringcontrollermucjava222.controller;

import org.springframework.web.bind.annotation.*;

import javax.swing.*;
@RestController
@RequestMapping("Hello")

public class HelloController {

    @GetMapping
    public String HelloWorld (){

        return "HelloWorld";
    }

    @PostMapping
    public String  acceptHello (@RequestBody String request){
        return "Dies war ihr Request:" + request;
    }
/*
Schreibe einen zusätzlichen GET-Endpunkt, der den Vornamen als Query-Parameter entgegennimmt und den Aufrufer persönlich begrüßt
 */
    // @PutMapping String wesayHello (@RequestBody String request){
    //  return "Spring is crazy shit:" + request;}

    @GetMapping("/Porsche")
    public String myAppleIsGreen (@RequestParam String calour){
        return "My Porsche is" + calour;
    }

    @PostMapping("/Lengths")
    public String returnLengths (@RequestBody String lengths){
        return "The string has:" + lengths.length()+" characters";

    }
}
