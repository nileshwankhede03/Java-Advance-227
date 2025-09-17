package com.marvellous.MarvellousPortal.service;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    // C
    // POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    // R ; read
    // GET
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    public Optional<BatchEntry> findById(ObjectId id)
    {
        return batchEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }

    public String updatebyId(ObjectId id, BatchEntry data)
    {
        Optional<BatchEntry> idData = batchEntryRepository.findById(id);

        if(idData.isPresent())
        {
            BatchEntry existData = idData.get();
            existData.setName(data.getName());
            existData.setFees(data.getFees());
            batchEntryRepository.save(existData);
            return "Data updated successfully";
        }
        else
        {
            return "Entry not found...";
        }
    }

}
