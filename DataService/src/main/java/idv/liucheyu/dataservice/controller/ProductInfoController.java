package idv.liucheyu.dataservice.controller;

import idv.liucheyu.commonservice.ResponseData;
import idv.liucheyu.commonservice.ResponseService;
import idv.liucheyu.dataservice.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/production")
public class ProductInfoController {

    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Autowired
    private ResponseService responseService;

    @GetMapping(value = "/cl/{mainClass}")
    public ResponseEntity<ResponseData> getProductInfoByMainClass(@PathVariable("mainClass") String mainClass){
        return responseService.send(productInfoMapper.getProductInfoListByMainClass(mainClass));
    }



 }
