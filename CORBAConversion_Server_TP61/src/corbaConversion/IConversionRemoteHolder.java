package corbaConversion;

/**
* corbaConversion/IConversionRemoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Conversion.idl
* Thursday, November 30, 2023 9:21:38 AM WAT
*/

public final class IConversionRemoteHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaConversion.IConversionRemote value = null;

  public IConversionRemoteHolder ()
  {
  }

  public IConversionRemoteHolder (corbaConversion.IConversionRemote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaConversion.IConversionRemoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaConversion.IConversionRemoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaConversion.IConversionRemoteHelper.type ();
  }

}
