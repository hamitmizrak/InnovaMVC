package com.patika.web;

//DTO- Data Transfer Object,
//DAO- Data Access Object


import com.patika.model.Student;
import com.patika.model.WriterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class _01_ResponseBody {
    //@GetMapping:url
    //return: gidelcek sayfa
    //1
    //http://localhost:3333/birinci
    @GetMapping("/birinci")
    @ResponseBody //sayfaya gitmeden ekranda yazdırmak
    public String birinciMethod() {
        return "Yükleniyor...";
    }

    //2
    //http://localhost:3333/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod() {
        return "index";
    }

    //3
    //http://localhost:3333/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod() {
        return "other/deneme";
    }

    //4
    //http://localhost:3333/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model) {
        model.addAttribute("param_key", "Merhabalar Spring Model ile geldi data");
        return "param";
    }


    ////////////////////////////////// PathVariable ///////////////////////////////////////////////////////
    //PathVariable
    //5
    //http://localhost:3333/besinci/44
    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model, @PathVariable(name = "param1") int sayi) {
        model.addAttribute("param_key", "merhabalar " + sayi);
        return "pathvariable";
    }

    //6
    //http://localhost:3333/altinci
    //http://localhost:3333/altinci/44
    //UNUTMA: Wrapper class kullanmalısın
    @GetMapping({"/altinci/{param1}", "/altinci"})
    public String altinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        model.addAttribute("param_key", "Data: " + sayi);
        return "pathvariable";
    }

    //6
    //http://localhost:3333/altinci
    //http://localhost:3333/altinci/44
    //UNUTMA: Wrapper class kullanmalısın
    @GetMapping({"/yedinci/{param1}", "/yedinci"})
    public String yedinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        if (sayi != null) {
            model.addAttribute("param_key", "Data: " + sayi);
        } else {
            model.addAttribute("param_key", "Data: ");
        }
        return "pathvariable";
    }

    ///////////////////////////////// RequestParam ///////////////////////////////////////////////////////

    //http://localhost:3333/sekinci?query=44
    @GetMapping("/sekinci")
    public String sekinciMethod(Model model, @RequestParam(name = "query") Integer sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }


    //http://localhost:3333/dokuncu
    //http://localhost:3333/dokuncu?query=44
    @GetMapping("/dokuncu")
    public String dokuzuncuMethod(Model model, @RequestParam(name = "query", required = false, defaultValue = "0") Long sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }


    //http://localhost:3333/onuncu
    //http://localhost:3333/onuncu?adi=Hamit&soyadi=Mızrak
    @GetMapping("/onuncu")
    public String onuncuMethod(
            Model model,
            @RequestParam(name = "adi", required = false, defaultValue = "adınızı girmediniz") String adi,
            @RequestParam(name = "soyadi", required = false, defaultValue = "soyadınızı girmediniz") String soyadi
    ) {

        model.addAttribute("param_key", "Data ID: " + adi + " " + soyadi);
        return "pathvariable";
    }


    //http://localhost:3333/onbirinci
    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model) {
        Student student = Student.builder().adi("adını girmediniz...").soyadi("soyadınız girmediniz...")  .build();
        model.addAttribute("param_key", "Data ID: " + student);
        return "pathvariable";
    }

    /////////////////////////////////////// FORM //////////////////////////////////////////////////////////////////////////


   // http://localhost:3333/onikinci
    @GetMapping("/onikinci")
    public String getWriter(Model model) {
        //Database select
        WriterDto writerDto = WriterDto.builder().writerName("adınızı girmediniz").writerSurname("Soyadınızı girmediniz").writerAddress("address girmediniz").writerTelephoneNumber(11122233).build();
        model.addAttribute("form_key", writerDto);
        return "form";
    }

    //client yazdıklarını almak istiyorum
    // http://localhost:3333/onikinci
    @PostMapping("/onikinci")
    public String postWriter(Model model, WriterDto writerDto) {
        log.info(writerDto.getId() + " " + writerDto.getWriterName() + " " + writerDto.getWriterSurname() + " " + writerDto.getWriterAddress() + " " + writerDto.getWriterTelephoneNumber());
        //dosyaya yazdırma
        //Database Create işlemleri burada yapacağız.
        model.addAttribute("form_key", writerDto);
        return "form";
    }



}
