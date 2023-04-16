package com.code.jewelleryshop.controller;

import com.code.jewelleryshop.entity.Jewellery;
import com.code.jewelleryshop.service.JewelleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jewellery")
public class JewelleryController
{
    @Autowired
    private JewelleryService jewelleryService;

    @GetMapping
    public List<Jewellery> getAllJewellery()
    {
        return jewelleryService.getAllJewellery();
    }

    @GetMapping("/{id}")
    public Optional<Jewellery> getJewelleryById(@PathVariable("id") Integer jewelleryId)
    {
        return jewelleryService.getJewelleryById(jewelleryId);
    }

    @PostMapping
    public Jewellery createJewellery(@RequestBody Jewellery jewellery)
    {
        return jewelleryService.createJewellery(jewellery);
    }

    @PutMapping("/{id}")
    public Jewellery updateJewellery(@PathVariable("id") Integer jewelleryId, @RequestBody Jewellery incomingJewellery)
    {
        return jewelleryService.updateJewellery(jewelleryId, incomingJewellery);
    }

    @DeleteMapping("/{id}")
    public String deleteJewelleryById(@PathVariable("id") Integer jewelleryId)
    {
        return jewelleryService.deleteJewelleryById(jewelleryId);
    }
}
