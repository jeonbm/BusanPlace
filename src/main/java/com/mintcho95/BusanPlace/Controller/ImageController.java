package com.mintcho95.BusanPlace.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

@RestController
public class ImageController {

    // 이미지 요구 API 구현완료 ( 보안이슈 해결 해야할듯 )
    @GetMapping("/img/{_filename}")
    public ResponseEntity<byte[]> image(@PathVariable("_filename")String _filename) {
        System.out.println("이미지 메소드 호출 파라미터 : "+_filename);
        File f = new File("/Volumes/noname/Temp/"+_filename);

        ResponseEntity<byte[]> responseEntity = null;
        HttpHeaders headers = null;
        try {
            byte[] result = FileCopyUtils.copyToByteArray(f);

            headers = new HttpHeaders();
            headers.add("Content-type", Files.probeContentType(f.toPath()));

            responseEntity = new ResponseEntity<>(result, headers, HttpStatus.OK);
        }catch(IOException e){
            // NoContent시 크롬에서 정상처리된 페이지에서 머무르네
            responseEntity = new ResponseEntity<>(null, headers, HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }
}
