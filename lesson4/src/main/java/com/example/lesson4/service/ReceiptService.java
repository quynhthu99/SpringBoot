package com.example.lesson4.service;

import com.example.lesson4.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReceiptService {
    @Autowired
    ReceiptRepository receiptRepository;
    @Autowired
    ProductService productService;

    public ReceiptInfor showAll(){
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return receiptRepository.showInforAll();
    }


    public Boolean createReceipt(OrderReqDto orderReqDto) {
        String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        UserDTO userDTO = userRepository.getUserByName(username);
        List<ProductReqDto> productReqDtos = orderReqDto.getProductReqDtos();
        Integer money = 0;
        for(ProductReqDto productReqDto : productReqDtos){
            money =money+ productService.getProductById(productReqDto.getProductID()).getPriceOut()
                    *productReqDto.getAmount();
        }
        String status = "chua thanh toan";
        String UUID = java.util.UUID.randomUUID().toString();
        if(receiptRepository.addReceipt(UUID, money, status, userDTO.getID())==0){
            return false;
        };

        for (ProductReqDto productReqDto : productReqDtos) {
            productService.subAmountProduct(productReqDto.getProductID()
                    ,productReqDto.getAmount());
            if(receiptRepository.addReceiptDetails(UUID,productReqDto.getProductID(),productReqDto.getAmount())==0){
                return false;
            };
        }
        return true;
    }
}
