package com.tts.WeatherApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeService {

		@Autowired
		ZipCodeRepository zipCodeRepository;

		public List<ZipCode> getAllZipCodes() {
			List<ZipCode> zipCodes = new ArrayList<>();

			zipCodeRepository.findAll().forEach(zipCodes::add);

			return zipCodes;
		}

}
