package com.supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.supplier.client.DemandForecastingClient;
import com.supplier.model.OrderDTO;
import com.supplier.model.Supplier;
import com.supplier.repository.SupplierRepository;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private DemandForecastingClient demandForecastingClient;

    @Autowired
    private SupplierRepository supplierRepository;

    public List<OrderDTO> getAllOrders() {
        return demandForecastingClient.getAllOrders();
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long supplierId) {
        return supplierRepository.findById(supplierId).orElse(null);
    }
}
