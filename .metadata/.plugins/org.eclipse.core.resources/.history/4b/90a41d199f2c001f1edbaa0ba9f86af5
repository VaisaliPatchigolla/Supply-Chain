package com.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.supplier.model.OrderDTO;
import com.supplier.model.Supplier;
import com.supplier.service.SupplierService;
import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/orders")
    public List<OrderDTO> getAllOrders() {
        return supplierService.getAllOrders();
    }

    @PostMapping("/create")
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/all")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{supplierId}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable Long supplierId) {
        Supplier supplier = supplierService.getSupplierById(supplierId);
        return supplier != null ? ResponseEntity.ok(supplier) : ResponseEntity.notFound().build();
    }
}
