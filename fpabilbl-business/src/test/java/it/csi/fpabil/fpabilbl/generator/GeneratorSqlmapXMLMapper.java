package it.csi.fpabil.fpabilbl.generator;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmapXMLMapper {

    public void generator() throws Exception{

    	String fileGenerator = "mybatis/generator/fpabil_fpabilbl_generatorConfigXMLMapper.xml";
    	
    	
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(fileGenerator); 
        
        
		org.apache.commons.io.IOUtils.toByteArray(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileGenerator));
			
		ByteArrayInputStream is = new ByteArrayInputStream(org.apache.commons.io.IOUtils.toByteArray(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileGenerator)));
        
        ConfigurationParser cp = new ConfigurationParser(warnings);
       // Configuration config = cp.parseConfiguration(configFile);
        Configuration config = cp.parseConfiguration(is);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
        myBatisGenerator.generate(null);
        
        
        System.out.println("found # " + warnings.size() + " warning(s)");
        for( String warning: warnings){
        	System.out.println("warning: " + warning);
        	
        }
        
       

    } 
    public static void main(String[] args) throws Exception {
        try {
        	System.out.println("BEGIN");
            GeneratorSqlmapXMLMapper generatorSqlmap = new GeneratorSqlmapXMLMapper();
            generatorSqlmap.generator();
            System.out.println("END");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}