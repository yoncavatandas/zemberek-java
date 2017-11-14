package zzmmbrk;

import java.io.IOException;
import java.util.List;

import zemberek.morphology.analysis.WordAnalysis;
import zemberek.morphology.analysis.tr.TurkishMorphology;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        List<WordAnalysis> results = morphology.analyze("gidiyoruz");
        results.forEach(s -> System.out.println(s.formatLong()));
        System.out.println("***********************************");
        List<WordAnalysis> test = morphology.analyze("uzaklaþtýramadýk");
        test.forEach(wrd -> System.out.println(wrd.formatLong()));
	}

}
