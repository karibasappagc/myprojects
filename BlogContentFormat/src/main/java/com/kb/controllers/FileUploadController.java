package com.kb.controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {

	private static final int BYTES_DOWNLOAD = 1024;

	@RequestMapping(value = "/uploadSingleFile", method = RequestMethod.GET)
	public ModelAndView uploadSingleFileFormDisplay() {

		return new ModelAndView("uploadSingleFile");

	}

	// Handle the single file upload

	@RequestMapping(value = "/uploadSingleFile", method = RequestMethod.POST)
	public void uploadSingleFileHandler(@RequestParam(required=false,name="name") String filename,
			@RequestParam("file") MultipartFile file , HttpServletRequest request, HttpServletResponse response) {

		// file handling to upload it in the server path

		if (!file.isEmpty()) {
			try {
				String content = new String(file.getBytes());

				content = Utility.getFormattedString(content);
				doDownload(request, response,content);
			} catch (Exception e) {
				System.out.println("You failed to upload => ");
			}
		} else {
			System.out.println("You failed to upload because the file was empty.");
		}

	}

	private void doDownload(HttpServletRequest request, HttpServletResponse response, String content) throws IOException {
		response.setContentType("text/plain");
		response.setHeader("Content-Disposition", "attachment;filename=output.txt");
		InputStream is = new ByteArrayInputStream(content.getBytes());

		int read = 0;
		byte[] bytes = new byte[BYTES_DOWNLOAD];
		OutputStream os = response.getOutputStream();

		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
		os.flush();
		os.close();
	}


}
