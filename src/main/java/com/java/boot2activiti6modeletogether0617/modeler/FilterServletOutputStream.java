package com.java.boot2activiti6modeletogether0617.modeler;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterServletOutputStream extends ServletOutputStream {

  private DataOutputStream stream;
  private WriteListener writeListener;

  public FilterServletOutputStream(OutputStream output) {
    stream = new DataOutputStream(output);
  }

  public void write(int b) throws IOException {
    stream.write(b);
  }

  public void write(byte[] b) throws IOException {
    stream.write(b);
  }

  public void write(byte[] b, int off, int len) throws IOException {
    stream.write(b, off, len);
  }
  
  @Override
  public void setWriteListener(WriteListener writeListener) {
    this.writeListener =  writeListener;
  }

  @Override
  public boolean isReady() {
    return true;
  }
}