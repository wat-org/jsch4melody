package com.jcraft.jsch;

// FEAT : 0.1.50-p1 : introduce JSchExceptionInterrupted, 
// which could be raised when interrupted, without changing the contract (cause it herits JSchException)
public class JSchExceptionInterrupted extends JSchException {

  private static final long serialVersionUID = -7686536365758731989L;

  private Throwable cause = null;

  public JSchExceptionInterrupted(){
    super();
  }

  public JSchExceptionInterrupted(String s){
    super(s);
  }

  public JSchExceptionInterrupted(String s, Throwable e){
    super(s);
    this.cause = e;
  }

  public Throwable getCause(){
    return this.cause;
  }

}