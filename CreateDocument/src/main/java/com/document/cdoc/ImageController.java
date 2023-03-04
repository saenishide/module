package com.document.cdoc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageController {

	@RequestMapping("/getPng")
	@ResponseBody
	public HttpEntity<byte[]> getPng(@RequestParam("name") String fileName){
		Path path = Paths.get("src/main/resources/static/images/"+ fileName +".png");
		byte[] byteImg = null;
		HttpHeaders headers = null;
		try {
			//バイト列に変換
			byteImg = Files.readAllBytes(path);
			headers = new HttpHeaders();
			
			//Responseのヘッダーを作成
			headers.setContentType(MediaType.IMAGE_PNG);
			headers.setContentLength(byteImg.length);
		}catch(IOException e) {
			return null;
		}
		return new HttpEntity<byte[]>(byteImg,headers);
	}

	@RequestMapping("/getJpg")
	@ResponseBody
	public HttpEntity<byte[]> getJpg(@RequestParam("name") String fileName){
		Path path = Paths.get("src/main/resources/static/images/"+ fileName +".jpg");
		byte[] byteImg = null;
		HttpHeaders headers = null;
		try {
			//バイト列に変換
			byteImg = Files.readAllBytes(path);
			headers = new HttpHeaders();
			
			//Responseのヘッダーを作成
			headers.setContentType(MediaType.IMAGE_PNG);
			headers.setContentLength(byteImg.length);
		}catch(IOException e) {
			return null;
		}
		return new HttpEntity<byte[]>(byteImg,headers);
	}
	

}
