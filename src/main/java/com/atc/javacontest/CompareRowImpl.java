package com.atc.javacontest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompareRowImpl implements ICompareRow {

	public CorrelationResultIndex executeTest0(URL resource) {
		CorrelationResultIndex index = new CorrelationResultIndex();
		try {
			List<String> lines = Files.readAllLines(Paths.get(new URI("file:/E:/%40Development/%40Java/%40Projects/SE/javacontest/target/test-classes/test0/rows.csv")), StandardCharsets.UTF_8);
			int count = 0;
			int equals = 0;
			for(String line:lines){
				String[] values = line.split(";");
				if(Double.parseDouble(values[1].replace(',', '.')) == Double.parseDouble(values[1].replace(',', '.')) ){
					equals++;	
				}
				count++;
			}
			index.correlation = equals/count;
			index.correlationLagIndex = 0;
			index.correlationMutipleIndex = 0;
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return index;
	}

	public CorrelationResultIndex executeTest1(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest2(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest3(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest4(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest5(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest6(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest7(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest8(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public CorrelationResultIndex executeTest9(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CorrelationResultIndex> executeTest10(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CorrelationResultIndex> executeTest11(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}


}
