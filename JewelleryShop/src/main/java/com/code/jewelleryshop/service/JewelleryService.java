package com.code.jewelleryshop.service;

import com.code.jewelleryshop.entity.Jewellery;
import com.code.jewelleryshop.repo.JewelleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JewelleryService
{
    @Autowired
    private JewelleryRepository jewelleryRepository;

    public List<Jewellery> getAllJewellery()
    {
        return jewelleryRepository.findAll();
    }

    public Optional<Jewellery> getJewelleryById(Integer jewelleryId)
    {
        return jewelleryRepository.findById(jewelleryId);
    }

    public Jewellery createJewellery(Jewellery jewellery)
    {
        return jewelleryRepository.save(jewellery);
    }

    public Jewellery updateJewellery(Integer jewelleryId, Jewellery incomingJewellery)
    {
        incomingJewellery.setId(jewelleryId);
        return jewelleryRepository.save(incomingJewellery);
    }

    public String deleteJewelleryById(Integer jewelleryId)
    {
        jewelleryRepository.deleteById(jewelleryId);
        return "Jewellery with id " + jewelleryId + " deleted successfully";
    }
}
