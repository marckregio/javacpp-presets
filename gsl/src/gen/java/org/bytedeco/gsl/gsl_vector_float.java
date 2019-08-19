// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_vector_float extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_vector_float() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_vector_float(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_vector_float(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_vector_float position(long position) {
        return (gsl_vector_float)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_vector_float size(long setter);
  public native @Cast("size_t") long stride(); public native gsl_vector_float stride(long setter);
  public native FloatPointer data(); public native gsl_vector_float data(FloatPointer setter);
  public native gsl_block_float block(); public native gsl_vector_float block(gsl_block_float setter);
  public native int owner(); public native gsl_vector_float owner(int setter);
}
