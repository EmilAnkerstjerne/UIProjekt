package com.example.demo.controllers;

import com.example.demo.models.Madvare;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Controller
public class MadvarerController {
    ArrayList<Madvare> madvareArrayList = new ArrayList<>();


    @GetMapping("/index")
    public String indexHTML(){
        return "index";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/om")
    public String about(){
        return "about";
    }

    @GetMapping("/madvarer")
    public String madvarer(Model madvarerModel){
        for(int i=0; i<5; i++){
            madvareArrayList.add(new Madvare("", "", "", ""));
        }
        madvarerModel.addAttribute("mad1", madvareArrayList.get(4));
        madvarerModel.addAttribute("mad2", madvareArrayList.get(3));
        madvarerModel.addAttribute("mad3", madvareArrayList.get(2));
        madvarerModel.addAttribute("mad4", madvareArrayList.get(1));
        madvarerModel.addAttribute("mad5", madvareArrayList.get(0));

        return "madvarer";
    }

    @PostMapping("/postMadvare")
    public String postMadvarer(WebRequest dataFromForm){
        String madvare = dataFromForm.getParameter("madvare");
        String udloeb = dataFromForm.getParameter("udloeb");
        String pris = dataFromForm.getParameter("pris");
        String tlfnr = dataFromForm.getParameter("tlfnr");

        madvareArrayList.set(4, madvareArrayList.get(3));
        madvareArrayList.set(3, madvareArrayList.get(2));
        madvareArrayList.set(2, madvareArrayList.get(1));
        madvareArrayList.set(1, madvareArrayList.get(0));
        madvareArrayList.set(0, new Madvare(madvare, "Varen udloeber: " + udloeb, "Pris: " +  pris, tlfnr));

        return "redirect:/madvarer";
    }
}
