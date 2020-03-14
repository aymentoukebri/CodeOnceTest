package org.codeonce.services;

import org.springframework.stereotype.Service;

@Service
public class CodeonceServiceImp implements CodeonceSerivce {
	@Override
	public int Occurences(String sentence) {
		int occ = 0;
		for (int i = 0; i < sentence.length(); i++) {
			switch (sentence.charAt(i)) {
			case '.':
				occ++;
				break;
			case '!':
				occ++;
				break;
			case '?':
				occ++;
				break;
			case ';':
				occ++;
				break;
			case ',':
				occ++;
				break;
			case ':':
				occ++;
				break;

			}
		}
		return occ;
	}

}
