// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* General evolution object.
 */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_odeiv_evolve extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_odeiv_evolve() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_odeiv_evolve(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_odeiv_evolve(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_odeiv_evolve position(long position) {
        return (gsl_odeiv_evolve)super.position(position);
    }

  public native @Cast("size_t") long dimension(); public native gsl_odeiv_evolve dimension(long setter);
  public native DoublePointer y0(); public native gsl_odeiv_evolve y0(DoublePointer setter);
  public native DoublePointer yerr(); public native gsl_odeiv_evolve yerr(DoublePointer setter);
  public native DoublePointer dydt_in(); public native gsl_odeiv_evolve dydt_in(DoublePointer setter);
  public native DoublePointer dydt_out(); public native gsl_odeiv_evolve dydt_out(DoublePointer setter);
  public native double last_step(); public native gsl_odeiv_evolve last_step(double setter);
  public native @Cast("unsigned long int") long count(); public native gsl_odeiv_evolve count(long setter);
  public native @Cast("unsigned long int") long failed_steps(); public native gsl_odeiv_evolve failed_steps(long setter);
}
