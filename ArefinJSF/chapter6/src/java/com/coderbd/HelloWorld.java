/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author User
 */
public class HelloWorld extends SimpleTagSupport{
    @Override
  public void doTag() throws JspException, IOException {
    // now write out the formatted date to the page
    getJspContext().getOut().write("Hello World!");
  }
}
