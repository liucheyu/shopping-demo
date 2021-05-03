package idv.liucheyu.productapi.controller;

import idv.liucheyu.commonservice.ResponseData;
import idv.liucheyu.commonservice.ResponseService;
import idv.liucheyu.productapi.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProductInfoController {

    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Autowired
    private ResponseService responseService;

    @GetMapping(value = "/cl/{mainClass}")
    public ResponseEntity<ResponseData> getProductInfoByMainClass(@PathVariable("mainClass") String mainClass){
        return responseService.send(productInfoMapper.getProductInfoListByMainClass(mainClass));
    }

    @PostMapping
    public ResponseEntity<ResponseData> getProductInfoByClassAndIDs() {
        return responseService.send("");
    }

 }
