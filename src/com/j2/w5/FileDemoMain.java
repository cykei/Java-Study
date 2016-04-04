/*
 * @author cyi
 * @since 160404
 * how to use file decorator
 */

package com.j2.w5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class FileDemoMain{
  public static void main(String[]args) throws Exception {
     File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home is"+myhome);
      
      String cwd=new File(".").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      File readme=new File(cwd,"HelloWorld.java");
      System.out.println("readme is "+readme);
      
      FileInputStream isReadme=new FileInputStream(readme);
      InputStreamReader isrReadme=new InputStreamReader(isReadme,"UTF8");
      int i;
      char c;
    try{
      while((i=isReadme.read()) !=1) {
        c=(char)i;
        System.out.print(c);
      }
    } catch(Exception e){
      e.printStackTrace();
    }finally{
      if(isReadme !=null)
        isReadme.close();
    }
  }
}
        