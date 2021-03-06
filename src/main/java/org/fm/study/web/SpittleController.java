package org.fm.study.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model) {
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max", defaultValue = "" + Long.MAX_VALUE) long max,
            @RequestParam(value = "count", defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/{spittleId}/{spittleName}", method = RequestMethod.GET)
    public String spittleName(@PathVariable("spittleId") int spittleId,
                          @PathVariable("spittleName") String spittleName,
                          Model model) {
        Spittle s = spittleRepository.findOne(spittleId);
        s.setMessage(String.format("This is a Spittle with name %s", spittleName));
        model.addAttribute(s);
        return "spittle";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") int spittleId, Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

}