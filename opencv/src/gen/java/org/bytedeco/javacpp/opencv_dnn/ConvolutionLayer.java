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


    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.javacpp.opencv_dnn.opencv_dnn_presets.class)
public class ConvolutionLayer extends BaseConvolutionLayer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ConvolutionLayer(Pointer p) { super(p); }
    
        public static native @Ptr BaseConvolutionLayer create(@Const @ByRef LayerParams params);
    }