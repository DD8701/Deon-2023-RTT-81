package com.davis.perscholas;

import com.davis.perscholas.util.GenerateDataUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GenerateDataUtil obj = new GenerateDataUtil();
      //  obj.createDataManyToOne();
    	
       // GenerateDataUtil.createDataOneToMany();
       // GenerateDataUtil.createDataOneToOne();
        GenerateDataUtil.createDataManyToMany();
    	
    }
}

