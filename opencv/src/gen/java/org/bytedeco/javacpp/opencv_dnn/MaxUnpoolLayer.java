// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;

import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_dnn.opencv_dnn_presets.class)
public class MaxUnpoolLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MaxUnpoolLayer(Pointer p) { super(p); }
    
        public native @ByRef Size poolKernel(); public native MaxUnpoolLayer poolKernel(Size poolKernel);
        public native @ByRef Size poolPad(); public native MaxUnpoolLayer poolPad(Size poolPad);
        public native @ByRef Size poolStride(); public native MaxUnpoolLayer poolStride(Size poolStride);

        public static native @Ptr MaxUnpoolLayer create(@Const @ByRef LayerParams params);
    }