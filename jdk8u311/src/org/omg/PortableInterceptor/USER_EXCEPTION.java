package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/USER_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u311/1894/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, September 27, 2021 5:16:46 AM PDT
*/

public interface USER_EXCEPTION
{

  /**
   * Indicates a UserException reply status. One possible value for 
   * <code>RequestInfo.reply_status</code>.
   * @see RequestInfo#reply_status
   * @see SUCCESSFUL
   * @see SYSTEM_EXCEPTION
   * @see LOCATION_FORWARD
   * @see TRANSPORT_RETRY
   */
  public static final short value = (short)(2);
}